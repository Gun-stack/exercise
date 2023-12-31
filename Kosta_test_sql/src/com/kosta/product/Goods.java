package com.kosta.product;

public class Goods {
	// 상품 코드용 sequence
	private static int PRODUCT_SEQ = 1;

	// 제품 카테고리 BOOK, COMPUTER, ETC
	public final static String CATE_BOOK = "BOOK";
	public final static String CATE_COMPUTER = "COMPUTER";
	public final static String CATE_ETC = "ETC";
	
	
	private int no;
	// 제품 코드
	private String code ;
	// 제품 이름
	private String name;
	// 제품 가격
	private int price;
	// 제품 수량
	private int stock;
	// 제품 종류
	private String category;

	// 생성자 정의
	public Goods(String name, int price, int stock, String category) {
		this.name=name;
		this.price=price;
		this.stock=stock;
		this.category=category;
		this.no = PRODUCT_SEQ++;
	    this.code = "P-" + no; 
	}

	// Setter, Getter
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	// 구현해야 하는 부분
	// toString override
	@Override
	public String toString() {
		return String.format("상품 정보: 코드 %s, %s, 가격 %d원, 재고 %d개", code, name, price, stock);
	}
}
