package com.recursion;

public class printnnumbers {
	public static void nnum(int n) {
		if (n==0) {
			return;
		}
		nnum(n-1);
		System.out.println(n);

	}

	public static void main(String[] args) {
		printnnumbers.nnum(5);

	}

}
