package com.Day11;

import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fib(n));

	}

	static int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		} else {
			return  fib(n - 1)  + fib(n - 2);

		}
	}
}
