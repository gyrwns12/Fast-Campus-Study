package ch08;

public class Person {
	private int height, weight, age;
	private String name, gender;
	
	public Person(String name, int age, int height, int weight, String gender) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
	}
	
	public String PersonPrint() {
		return "키가 " + height + " 이고 몸무게가 " + weight + " 킬로인 " + gender + "이 있습니다. 이름은 " + name + " 이고 나이는 " + age + "세 입니다.";
	}
}
