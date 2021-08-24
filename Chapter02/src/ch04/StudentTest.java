package ch04;

public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student();
		
		student.studentID = 12345;
		student.setStudentName("Yun");
		student.address = "서울 강남구";
		
		student.showStudentInfo();
	
		Student studentYun = new Student();
		studentYun.studentID = 54321;
		studentYun.studentName = "Yun";
		studentYun.address = "경기도 성남시";
		
		studentYun.showStudentInfo();
	}
}