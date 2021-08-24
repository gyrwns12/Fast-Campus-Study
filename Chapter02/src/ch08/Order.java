package ch08;

public class Order {
	private int orderDate,  orderPrice;
	private String orderNum, orderPhoneNum, orderAddress, orderTime, menuNum;
	
	public Order(String orderNum, String orderPhoneNum, int orderDate, String orderTime, int orderPrice, String menuNum, String orderAddress) {
		this.orderNum = orderNum;
		this.orderPhoneNum = orderPhoneNum;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.orderPrice = orderPrice;
		this.menuNum = menuNum;
		this.orderAddress = orderAddress;
	}
	
	public void OrderPrint() {
		System.out.println("주문 접수 번호 : " + orderNum);
		System.out.println("주문 핸드폰 번호 : " + orderPhoneNum);
		System.out.println("주문 집 주소 : " + orderAddress);
		System.out.println("주문 날짜 : " + orderDate);
		System.out.println("주문 시간 : " + orderTime);
		System.out.println("주문 가격 : " + orderPrice);
		System.out.println("메뉴 번호 : " + menuNum);
	}
}
