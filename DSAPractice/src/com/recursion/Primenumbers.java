package com.recursion;

public class Primenumbers {
	public static boolean normalPrimeCheckusingFactors(int n) {
		int c = 0;
		for(int i =2; i<=n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==1)
			return true;
		else
			return false;
	}
	
	public static boolean normalPrimenum(int n) {
		if (n<2) {
			return false;
		}
		for(int i = 2; i<=Math.sqrt(n);i++) {
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static boolean recursivePrimesquaremethod(int n) {
		if(n<2) {
			return false;
		}
		return checkdivisor(n,2);
		
	}
	private static boolean checkdivisor(int n, int i) {
		if(i * i > n)
			return true;
		if( n % i == 0)
			return false;
		
		return checkdivisor(n,i+1);
	}

	public static void main(String[] args) {
		System.out.println(Primenumbers.normalPrimenum(6));
		System.out.println(Primenumbers.normalPrimeCheckusingFactors(6));
		System.out.println(Primenumbers.recursivePrimesquaremethod(17));
	}

}
