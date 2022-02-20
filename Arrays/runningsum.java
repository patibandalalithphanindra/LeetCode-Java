package com.arrays.easy;

import java.util.Arrays;
import java.util.Scanner;

public class runningsum {
	static int[] sum(int arr[],int n)
	{
		for (int i = 1; i < n; i++){
            arr[i] += arr[i-1];
        }
        return arr;
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
	    System.out.println(Arrays.toString(sum(arr,n)));

	}

}
