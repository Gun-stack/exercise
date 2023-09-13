package com.kosta;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.kosta.order.Order;
import com.kosta.product.Goods;

public class ShopDAO {

	public class PlayerDAO {
	}

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Properties db = new Properties();
			db.load(new FileInputStream("db.properties"));
			Class.forName(db.getProperty("Driver"));
			conn = DriverManager.getConnection(db.getProperty("url"), db.getProperty("user"),
					db.getProperty("password"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void close(Connection conn) {
		try {
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// String name, int price, int stock, String category
	public static String insertGoods(Connection conn, Goods goods) {
		 String productCode = null;
		    PreparedStatement pstmt = null;
		    try {
		        String sql = "INSERT INTO goods (name, price, stock, category) VALUES (?, ?, ?, ?)";
		        pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		        pstmt.setString(1, goods.getName());
		        pstmt.setInt(2, goods.getPrice());
		        pstmt.setInt(3, goods.getStock());
		        pstmt.setString(4, goods.getCategory());
		        pstmt.executeUpdate();

		        ResultSet generatedKeys = pstmt.getGeneratedKeys();
		        if (generatedKeys.next()) {
		            productCode = generatedKeys.getString(1);
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		    } finally {
		        try {
		            if (pstmt != null) {
		                pstmt.close();
		            }
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }
		    return productCode;
		}

	public static int insertOrder(Connection conn, Order order) {
	    int cnt = 0;
	    PreparedStatement pstmt = null;

	    try {
	        String sql = "INSERT INTO orders (customer, productCode, amount, isCanceled) VALUES (?, ?, ?, ?)";
	        pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
	        pstmt.setString(1, order.getCustomer());
	        pstmt.setString(2, order.getProductCode());
	        pstmt.setInt(3, order.getAmount());
	        pstmt.setInt(4, 0); // 0은 "취소되지 않음"을 가정합니다.
	        cnt = pstmt.executeUpdate();

	        // 생성된 주문 번호를 Order 객체에 설정합니다.
	        ResultSet generatedKeys = pstmt.getGeneratedKeys();
	        if (generatedKeys.next()) {
	            int generatedOrderNumber = generatedKeys.getInt(1);
	            order.setNo(generatedOrderNumber);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (pstmt != null) {
	                pstmt.close();
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    return cnt;
	}

	public static Goods selectGoods(Connection conn, String productcode) {
		Goods goods = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select name, price,stock,category from goods where CODE = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, productcode);
			rs = pstmt.executeQuery();
			if (rs != null && rs.next()) {
				goods = new Goods(rs.getString("name"), rs.getInt("price"), rs.getInt("stock"),
						rs.getString("category"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return goods;
	}

	public static Order selectOrderByNum(Connection conn, int ordernum) {
		Order order = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select * from orders where order_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, ordernum);
			rs = pstmt.executeQuery();
			if (rs != null && rs.next()) {
				order = new Order(rs.getString("customer"), rs.getString("productCode"), rs.getInt("amount"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return order;
	}

	public static List<Goods> allGoods(Connection conn) {
		List<Goods> goodsList = new ArrayList<>();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			String sql = "select * from goods ";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Goods goods = new Goods(rs.getString("name"), rs.getInt("price"), rs.getInt("stock"),
						rs.getString("category"));
				goodsList.add(goods);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return goodsList;
	}

	public static int cancelOrder(Connection conn, int ordernum) {
		int cnt = 0;
		PreparedStatement pstmt = null;
		try {
			String sql = "UPDATE orders SET isCanceled = 1 WHERE order_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, ordernum);
			cnt = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return cnt;
	}

	public static List<Order> allOrder(Connection conn) {
		List<Order> orders = new ArrayList<>();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			String sql = "select * from orders ";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Order order = new Order(rs.getString("customer"), rs.getString("productcode"), rs.getInt("amount"));
				orders.add(order);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return orders;
	}

	public static List<Order> orderDetail(Connection conn, String name, String isC) {
		List<Order> orders = new ArrayList<>();
		Statement stmt = null;
		ResultSet rs = null;
		int sel = 0;
		try {
			if (isC == "정상") {
				sel = 0;
			} else if (isC == "취소") {
				sel = 1;
			}
			 String sql = String.format("SELECT o.customer, o.productCode, o.amount, g.price FROM orders o " +
                     "INNER JOIN goods g ON o.productCode = g.CODE " +
                     "WHERE o.isCanceled = %d", sel);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			 while (rs.next()) {
		            Order order = new Order(rs.getString("customer"), rs.getString("productCode"), rs.getInt("amount"));
		            order.setPrice(rs.getInt("price")); // 상품 가격 추가
		            orders.add(order);
		        }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return orders;
	}

}
