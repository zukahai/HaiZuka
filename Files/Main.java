package Java13;

import java.util.Scanner;

public class Main {

	public static void sayHi() {
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("N = ");
		int n = sc.nextInt();
		
		int a[] = new int[n];

		// a[0] = sc.nextInt();
		// a[1] = sc.nextInt();
		// a[2] = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu thu: " + i + ": ");
			a[i] = sc.nextInt();
		}
			

		// System.out.println(a[0] + " " + a[1] + " " + a[2]);
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}
}
