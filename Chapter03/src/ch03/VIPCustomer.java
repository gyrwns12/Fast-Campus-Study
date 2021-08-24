package ch03;

public class VIPCustomer extends Customer {

	double salesRatio;
	private String agentID;
	
	/*public VIPCustomer() {
		super(0, "no-name");
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		
		System.out.println("VIPCustomer() Call");
	}*/
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) Call");
	}
	
	public String getAgentID() {
		return agentID;
	}
}