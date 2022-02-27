package com.strings;
import java.util.*;

public class Reveachword {
	static String reverseword(String str)
	{
		String ans = "";
		int cwstart = 0;
		int i=0;
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				int cwend = i-1;
				String rword = "";
				for(int j=cwstart;j<=cwend;j++)
				{
					rword = str.charAt(j)+rword;
				}
				ans+=rword+" ";
				cwstart = i+1;
			}
			
		}
		int cwend = i-1;
		String rword = "";
		for(int j=cwstart;j<=cwend;j++)
		{
			rword = str.charAt(j)+rword;
		}
		ans+=rword+" ";
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc def ghi";
		System.out.println(reverseword(str));

	}

}
