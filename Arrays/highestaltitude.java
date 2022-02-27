package com.arrays.easy;

import java.util.Scanner;

public class highestaltitude {
	public static int altitude(int[] nums)
	{
		int arr[] = new int[nums.length+1];
		arr[0] = 0;
		for(int i=1;i<=nums.length;i++)
		{
			arr[i] = nums[i-1];
		}
		for(int i=1;i<arr.length;i++)
		{
			arr[i] = arr[i]+arr[i-1];
		}
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max = arr[i];
		}
		return max;
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
	    System.out.println(altitude(arr));
		

	}

}
