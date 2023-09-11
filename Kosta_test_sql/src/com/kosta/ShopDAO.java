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
	public static int insertGoods(Connection conn, Goods goods) {
		int cnt = 0;
		PreparedStatement pstmt = null;
		try {
			String sql = "Insert into goods (COde,name,price,stock,category)  VALUES (?,?,?,?,?) ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, goods.getCode());
			pstmt.setString(2, goods.getName());
			pstmt.setInt(3, goods.getPrice());
			pstmt.setInt(4, goods.getStock());
			pstmt.setString(5, goods.getCategory());
			cnt = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return cnt;
	}

	public static int insertOrder(Connection conn, Order order){
		int cnt = 0;
		PreparedStatement pstmt = null;
		try {
			String sql = "Insert INTO orders (customer, productCode, amount) VALUES(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, order.getCustomer());
			pstmt.setString(2, order.getProductCode());
			pstmt.setInt(3, order.getAmount());
			cnt = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return cnt;
	}
	
	public static Goods selectGoods(Connection conn, String productcode) {
		Goods goods =  null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select name, price,stock,category from goods where CODE = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, productcode);
			rs = pstmt.executeQuery();
			if (rs != null && rs.next()) {
				goods = new Goods(rs.getString(1), 
						rs.getInt(3), rs.getInt(4),rs.getString(5));
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
				order = new Order(
						rs.getString("customer"), 
						rs.getString("productCode"), 
						rs.getInt("amount"));
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
			stmt= conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Goods goods =  new Goods(rs.getString("name"),
											rs.getInt("price"),
											rs.getInt("stock"),
											rs.getString("category"));
				goodsList.add(goods);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return goodsList;
	}
	
	public static int cancelOrder(Connection conn, int ordernum) {
		int cnt =0;
		PreparedStatement pstmt = null;
		try {
			String sql = "update orders set isCanceled=1 where order_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, ordernum);
			cnt = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return cnt;
	}
	
	public static List<Order> allOrder(Connection conn) {
		List<Order> orders = new ArrayList<>();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			String sql = "select * from orders ";
			stmt= conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Order order =  new Order(rs.getString("customer"),
										rs.getString("productcode"),
											rs.getInt("amount"));
				orders.add(order);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return orders;
	}
	public static List<Order> orderDetail(Connection conn,String name, String isC) {
		List<Order> orders = new ArrayList<>();
		Statement stmt = null;
		ResultSet rs = null;
		int sel = 0;
		try {
			if (isC=="정상") {
				sel=0;
			}else if (isC=="취소") {
				sel=1;
			}
			String sql = String.format("select * from orders where isCanceled = %d", sel) ;
			stmt= conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Order order =  new Order(rs.getString("customer"),
										rs.getString("productcode"),
											rs.getInt("amount"));
				orders.add(order);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return orders;
	}
	
	
	
	
}




