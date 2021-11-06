package Java13;

import java.util.Scanner;

public class Main {

	public static int Tong(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++)
			sum += i;
		return sum;
	}

	public static void sayHi(String name) {
		System.out.println("Hi " + name);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 10; i++)
			System.out.println("Tong tu 1 den " + i + " la: " + Tong(i));
		sayHi("Hai");
		sayHi("Nam");
	}
}
