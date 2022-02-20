package com.arrays.easy;

import java.util.Scanner;

public class richestcustomer {
    static int rich(int[][] accounts) {
    int max = 0, sum;
    int rows = accounts.length;
    for (int i = 0; i < rows; i++){
        sum = 0;
        for (int j = 0; j < accounts[i].length; j++){
            sum += accounts[i][j];
        }
        if (max < sum){
            max = sum;
        }
    }
    return max;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	 Scanner sc = new Scanner(System.in);
         System.out.print("Enter num of rows: ");
         int r = sc.nextInt();
         System.out.print("Enter num of cols: ");
         int c = sc.nextInt();
         int[][] accounts = new int[r][c];
         for (int i=0; i < r; i++){
             System.out.print("Enter elements in row "+(i+1)+": ");
             for (int j=0; j < c; j++) {
                 accounts[i][j] = sc.nextInt();
             }
         }
         System.out.println("Maximum wealth : "+ rich(accounts));

	}

}
