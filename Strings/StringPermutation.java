package com.strings;

public class StringPermutation {
	public static boolean permutation(String str1,String str2)
	{
		if(str1.length()!=str2.length())
		{
			return false;
		}
		int f[] = new int[256];
		for(int i=0;i<256;i++)
		{
			f[i]=0;
		}
		for(int i=0;i<str1.length();i++)
		{
			char ch = str1.charAt(i);
			++f[ch];
		}
		for(int i=0;i<str2.length();i++)
		{
			char ch = str2.charAt(i);
			--f[ch];
		}
		for(int i=0;i<256;i++)
		{
		 if(f[i]!=0)
			 return false;
		}
		return true;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abcde";
		String str2 = "debac";
		System.out.print(permutation(str1,str2));

	}

}
