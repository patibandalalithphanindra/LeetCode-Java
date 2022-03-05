package com.recursion;

import java.util.Scanner;

public class numofdigits {
	static int finding(int n)
	{
		if(n==0)
			return 0;
		int ans = finding(n/10);
		return ans + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number : ");
		n = sc.nextInt();
		System.out.println(finding(n));

	}

}
