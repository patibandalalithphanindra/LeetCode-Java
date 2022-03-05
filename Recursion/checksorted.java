package com.recursion;

import java.util.*;

public class checksorted {
	static boolean sorted(int arr[],int n)
	{
	 if(n<=1)
		 return true;
	 if(arr[0]>arr[1])
		 return false;
	 int[] smallarr = new int[n-1];
	 for(int i=1;i<n;i++)
		 smallarr[i-1] = arr[i];
	 boolean ans = sorted(smallarr,n-1);
	 return ans;
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
	    System.out.println(sorted(arr,n));

	}

}
