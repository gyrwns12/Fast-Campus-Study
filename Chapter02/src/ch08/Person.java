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
		return "Ű�� " + height + " �̰� �����԰� " + weight + " ų���� " + gender + "�� �ֽ��ϴ�. �̸��� " + name + " �̰� ���̴� " + age + "�� �Դϴ�.";
	}
}
