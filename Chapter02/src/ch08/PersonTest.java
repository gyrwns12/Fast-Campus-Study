package ch08;

public class PersonTest {
	public static void main(String[] args) {
		String name = "Tomas", gender = "³²¼º";
		int age = 37, height = 180, weight = 78;
		
		Person p = new Person(name, age, height, weight, gender);
		
		System.out.println(p.PersonPrint());
	}
}
