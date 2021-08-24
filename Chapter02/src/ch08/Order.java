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
		System.out.println("�ֹ� ���� ��ȣ : " + orderNum);
		System.out.println("�ֹ� �ڵ��� ��ȣ : " + orderPhoneNum);
		System.out.println("�ֹ� �� �ּ� : " + orderAddress);
		System.out.println("�ֹ� ��¥ : " + orderDate);
		System.out.println("�ֹ� �ð� : " + orderTime);
		System.out.println("�ֹ� ���� : " + orderPrice);
		System.out.println("�޴� ��ȣ : " + menuNum);
	}
}
