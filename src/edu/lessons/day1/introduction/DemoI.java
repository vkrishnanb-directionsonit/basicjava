package edu.lessons.day1.introduction;

public class DemoI {

	public static void main(String[] args) {
		foo1();
	}

	public static void foo1() {
		int number = 9;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= number - i; j++) {
				System.out.print(".");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}
	}
}
