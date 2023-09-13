package com.kosta.shop;

import java.sql.Connection;
import java.util.List;

import com.kosta.ShopDAO;
import com.kosta.order.Order;
import com.kosta.product.Goods;

public class Shop {

	public static String addProduct(Goods goods) {
	    Connection conn = ShopDAO.getConnection();
	    String productCode = ShopDAO.insertGoods(conn, goods);
	    return productCode;
	}

	public static int order(Order order) {
		Connection conn = ShopDAO.getConnection();
		int result= ShopDAO.insertOrder(conn, order);
		if (result > 0) {
            order.setNo(result); // 주문 번호 설정
            order.setProductCode(order.getProductCode()); // 상품 코드 설정
        }
        return result;
	}

	public Goods findProductByCode(String productcode) {
		Connection conn = ShopDAO.getConnection();
	    Goods goods = ShopDAO.selectGoods(conn, productcode);
	    if (goods != null) {
	        // 데이터베이스에서 가격 정보를 가져와서 설정합니다.
	        Goods existingGoods = ShopDAO.selectGoods(conn, productcode);
	        goods.setPrice(existingGoods.getPrice());
	        System.out.println(goods);
	    } else {
	        System.out.println("해당 물품을 찾을 수 없습니다.");
	    }
	    return goods;
	}






	public static void printAllProductInfo() {
		Connection conn = ShopDAO.getConnection();
		try {
			List<Goods> goods = ShopDAO.allGoods(conn);
			for (Goods goods2 : goods) {
				System.out.println(goods2);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ShopDAO.close(conn);
		}
	}

	public static void printAllOrderInfo() {
		Connection conn = ShopDAO.getConnection();
		try {
			List<Order> order = ShopDAO.allOrder(conn);
			for (Order order2 : order) {
				System.out.println(order2);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ShopDAO.close(conn);
		}
	}

	public static Order findOrderByNo(int orderNum) {
		Connection conn = ShopDAO.getConnection();
		Order order = ShopDAO.selectOrderByNum(conn, orderNum);
		return order;
	}

	public static Order cancelOrder(int orderNum) {
		Connection conn = ShopDAO.getConnection();
	    Order order = ShopDAO.selectOrder(conn, orderNum);
	    
	    if (order != null && !order.isCanceled()) {
	        order.setCanceled(true); // 주문을 취소로 변경
	        ShopDAO.updateOrder(conn, order); // 주문 정보 업데이트
	        System.out.println(order);
	        return order;
	    } else {
	        System.out.println("주문취소 실패");
	        return null;
	    }
	}

	public void printOrderDetailsByCustomerAndIsCanceled(String customer, String isCanceled) {
	    Connection conn = ShopDAO.getConnection();
	    List<Order> orders = ShopDAO.selectOrderByCustomerAndIsCanceled(conn, customer, isCanceled);
	    int totalAmount = 0;

	    for (Order order : orders) {
	        System.out.println(order);
	        totalAmount += order.getAmount() * order.getPrice();
	    }

	    System.out.printf("%s님의 %s주문 건수는: %d건이고, %s주문합계금액은: %d원 입니다.%n", 
	        customer, isCanceled, orders.size(), isCanceled, totalAmount);
	}
	// 구현해야 하는 부분: ApplicationMain.java 오류 없이 작동하도록 필요한 모든 메서드를 구현한다.

}
