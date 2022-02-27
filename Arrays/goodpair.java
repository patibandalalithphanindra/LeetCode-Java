package com.arrays.easy;

import java.util.Scanner;

public class goodpair {
	public static int pair(int nums[])
	{
		int count = 0;
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]==nums[j])
					count++;
			}
		}
		return count;
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
	    System.out.println(pair(arr));
	}
}
