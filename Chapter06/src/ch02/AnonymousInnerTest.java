package ch02;

class Outer {

	int outNum = 100;
	static int sNum = 200;

	Runnable getRunnable(int i) {

		int num = 10;

		return new Runnable() {

			int localNum = 1000;

			@Override
			public void run() {

				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);

				System.out.println("outNum = " + outNum + "(�ܺ� Ŭ���� �ν��Ͻ� ����)");
				System.out.println("Outter.sNum = " + Outer.sNum + "(�ܺ� Ŭ���� ���� ����)");
			}
		};
	}
	
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {

			// num = 200; //����
			// i = 10; //����
			System.out.println("Runnable class");
		}
	};
}

public class AnonymousInnerTest {

	public static void main(String[] args) {

		Outer out = new Outer();
		Runnable runner = out.getRunnable(100);

		runner.run();
		System.out.println();
		
		out.runnable.run();
	}
}