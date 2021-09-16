package ch06;

public class VIPCustomer extends Customer {

	double salesRatio;
	private String agentID;

	/*
	 * public VIPCustomer() { super(0, "no-name");
	 * 
	 * bonusRatio = 0.05; salesRatio = 0.1; customerGrade = "VIP";
	 * 
	 * System.out.println("VIPCustomer() Call"); }
	 */

	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);

		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}

	@Override // 애노테이션 : 컴파일러에게 특별한 정보를 제공해주는 역할
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int) (price * salesRatio);
		return price;
	}

	public String getAgentID() {
		return agentID;
	}
}