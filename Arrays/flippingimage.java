package com.arrays.easy;

import java.util.Arrays;
import java.util.Scanner;

public class flippingimage {
	public static int[][] flip(int image[][])
	{
		int i,j,temp;
		for(i=0;i<image.length;i++)
		{
			int l = 0;
			int r = image[0].length-1;
				while(l<=r)
				{
				temp = image[i][l];
				image[i][l] = image[i][r];
				image[i][r] = temp;
				l++;
				r--;
				}
		}
		for(i=0;i<image.length;i++)
		{
			for(j=0;j<image[0].length;j++)
			{
				if(image[i][j]==1)
					image[i][j]=0;
				else
					image[i][j]=1;
			}
		}
		return image;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows and columns : ");
		m = sc.nextInt();
		n = sc.nextInt();
		int[][] arr = new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		flip(arr);
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
