package com.arrays.easy;

import java.util.Arrays;
import java.util.Scanner;

public class formarrays {
	static int[] build(int arr[],int n)
	{
		int res[] = new int[n];
		for(int i=0;i<n;i++)
		{
			res[i] = arr[arr[i]];
		}
	return res;		
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
	    System.out.println(Arrays.toString(build(arr,n)));
	    
	}

}
