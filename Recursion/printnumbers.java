package com.recursion;

import java.util.Scanner;

public class printnumbers {
    static void printing(int n)
    {
    	if(n==1)
    	{
    		System.out.print(n + " ");
    		return;
        }
    	printing(n-1);
    	System.out.print(n + " ");
    }
    	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number : ");
		n = sc.nextInt();
		printing(n);
	}

}
