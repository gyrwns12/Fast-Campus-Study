package ch16;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("¿Ãº¯Ω≈");
		
		System.out.println(Employee.getSerialNum());
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("±Ë¿ØΩ≈");
		
		System.out.println(employeeLee.getEmployeeName() + "¥‘¿« ªÁπ¯¿∫ " + employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "¥‘¿» ªÁπ¯¿∫ " + employeeKim.getEmployeeId());
	}
}