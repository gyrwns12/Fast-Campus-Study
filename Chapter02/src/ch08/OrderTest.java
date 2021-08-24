package ch08;

public class OrderTest {

	public static void main(String[] args) {
		String orderNum = "202011020003";
		String orderPhoneNum = "01023450001";
		String orderAddress = "서울시 강남구 역삼동 111-333";
		int orderDate = 20201102;
		String orderTime = "130258";
		int orderPrice = 35000;
		String menuNum = "0003";
		
		Order od = new Order(orderNum, orderPhoneNum, orderDate, orderTime, orderPrice, menuNum, orderAddress);
		
		od.OrderPrint();
	}
}