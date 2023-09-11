package com.kosta.shop;

import java.sql.Connection;
import java.util.List;

import com.kosta.ShopDAO;
import com.kosta.order.Order;
import com.kosta.product.Goods;

public  class Shop {
	
	public static void addProduct(Goods goods) {
		Connection conn = ShopDAO.getConnection();
		int result = ShopDAO.insertGoods(conn,goods);
		if (result>0) {
			System.out.println(result+"개 가 등록됨");
		}else {
			System.out.println("물품 등록 실패");
		}
	}

	
	public static int order(Order order) {
		int cnt=0;
		Connection conn = ShopDAO.getConnection();
		int result = ShopDAO.insertOrder(conn,order);
		if (result>0) {
			System.out.println("주문완료");
			cnt++;
		}else {
			System.out.println("주문 실패");
		}
		return  cnt;
	}
	public Goods findProductByCode(String produtcode) {
		Connection conn = ShopDAO.getConnection();
		Goods goods = ShopDAO.selectGoods(conn,produtcode);
		if (goods != null) {
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
		}finally {
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
		}finally {
			ShopDAO.close(conn);
		}
	}
	
	public static Order findOrderByNo(int orderNum) {
		Connection conn = ShopDAO.getConnection();
		Order order = ShopDAO.selectOrderByNum(conn,orderNum);
		return order;
	}
		
	public static Order cancelOrder(int orderNum) {
		Connection conn = ShopDAO.getConnection();
	 	 if (ShopDAO.cancelOrder(conn, orderNum)>0) {
			System.out.println("주문취소 완료");
		} else {
			System.out.println("주문취소 실패 ");
		}
		Order order = ShopDAO.selectOrderByNum(conn,orderNum);
		return order;
	}
	
	public static void printOrderDetailsByCustomerAndIsCanceled(String name, String isC) {
		Connection conn = ShopDAO.getConnection();
		ShopDAO.orderDetail(conn,name,isC);
		
	}
	
	//구현해야 하는 부분: ApplicationMain.java 오류 없이 작동하도록 필요한 모든 메서드를 구현한다.
	
	
	
}
