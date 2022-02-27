package com.arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class kidscandies 
{
	public static List<Boolean> candy(int[] candies, int extraCandies) 
	{
        ArrayList<Boolean> arr = new ArrayList<>();
      int max = 0;
      for (int i = 0; i <candies.length; i++) 
      {
          if(max <= candies[i])
          {
              max = candies[i];
          }
      }
      for (int i = 0; i <candies.length; i++) 
      {
          int sum = candies[i] + extraCandies;
          if(sum >= max)
          {
              arr.add(true);
          }
          else 
          {
              arr.add(false);
          }
      }
      return arr;
  }

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int n,k;
	    System.out.println("Enter the size of array : ");
	     n = sc.nextInt();
	     System.out.println("Enter the number of extra candies : "); 
	     k = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	arr[i] = sc.nextInt();
	    }
	    System.out.println(candy(arr,k));

	}

}
