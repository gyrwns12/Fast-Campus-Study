package ch06;

public class StudentTest {

	public static void main(String[] args) {
		Student studentYun = new Student();
		
		System.out.println(studentYun.showStudentInfo());
		
		Student studentY = new Student(123456, "Yun", 3);
		System.out.println(studentY.showStudentInfo());
	}
}