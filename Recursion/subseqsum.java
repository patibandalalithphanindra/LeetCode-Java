package com.recursion;
import java.util.*;
import java.util.ArrayList;

public class subseqsum {
	public static void printsubseq(int index,ArrayList<Integer> li,int s,int sum,int[] arr,int n) 
	{
		if(index==n)
		{
			if(s==sum)
			{
				for(int i : li)
				{
					System.out.print(i + " ");
				}
				System.out.println();
			}
		return;
		}
		li.add(arr[index]);
		s+=arr[index];
		
		printsubseq(index+1,li,s,sum,arr,n);
		
		s-=arr[index];
		li.remove(li.size()-1);
			
		//not picking
		printsubseq(index+1,li,s,sum,arr,n);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		int sum = 2;
		System.out.println("Enter size of array : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer> li = new ArrayList<Integer>();
		printsubseq(0,li,0,sum,arr,n);
	}

}
