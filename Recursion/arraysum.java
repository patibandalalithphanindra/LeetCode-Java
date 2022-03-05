package com.recursion;

import java.util.Scanner;

public class arraysum {
	public static int sum(int arr[],int n)
	{
		if(n==0)
			return 0;
		else 
		{
			return  sum(arr,n-1)+arr[n-1];
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int n;
	    System.out.println("Enter the size of array : ");
	     n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	arr[i] = sc.nextInt();
	    }
	    System.out.println(sum(arr,n));

	}

}
