package ch04;

public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student();
		
		student.studentID = 12345;
		student.setStudentName("Yun");
		student.address = "���� ������";
		
		student.showStudentInfo();
	
		Student studentYun = new Student();
		studentYun.studentID = 54321;
		studentYun.studentName = "Yun";
		studentYun.address = "��⵵ ������";
		
		studentYun.showStudentInfo();
	}
}