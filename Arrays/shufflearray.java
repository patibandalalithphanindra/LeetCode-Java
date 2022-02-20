package com.arrays.easy;

import java.util.Arrays;
import java.util.Scanner;

public class shufflearray {
	static int[] shuffle(int[] nums,int n)
	{
		int[] arr = new int[nums.length];
        int k = 0;
        int j = nums.length/2;
        for (int i = 0; i < nums.length/2; i++) {
            arr[k] = nums[i];
            arr[k+1] = nums[j];
            j++;
            k = k+2;
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
	    System.out.println(Arrays.toString(shuffle(arr,n)));

	}

}
