package com.recursion;
import java.util.*;

public class power {
	public static int calculatePower(int n,int x)
	{
		if(n==0)
			return 0;
		if(x==0)
			return 1;
		int ans = calculatePower(n, x-1);	
		return n * ans;
		/*
		 int ans = calculatePower(n, x/2);	
		  if(x%2 == 0)
		{
			return ans*ans;
		}
		else 
		{
			return n * ans * ans;
		} 
		*/		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the base : ");
		n = sc.nextInt();
		int x;
		System.out.println("Enter the power : ");
		x= sc.nextInt();
		System.out.print("The value is : ");
	    System.out.print(calculatePower(n,x));
	}
}
