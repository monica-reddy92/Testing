package com.CoreJava;

public class DoWhile_Continue {

	public static void main(String[] args)
{
		int i=1;
		do
		{
			System.out.println(i);
			i++;
			do
			{
				System.out.println(i);
				i++;
				if(i==3)
					continue;
			}
		while(i<=3);
		
			i++;
		}
		while(i<=5);
		
}
}
		
