package com.CoreJava;

public class for_loop {

	public static void main(String[] args) 
	
	{
		//simple and nested for loop
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");

			}
			System.out.println();
		}
		
		//for-each
		
		System.out.println("###########");
		char arr1[]= {'a','b','c','d','e'};
		char arr2[]=new char[2];
		arr2[0]='f';
		arr2[1]='g';
	
		for (char c:arr1)
		{
			System.out.print(c+" ");
		}
		for (char d:arr2)
		{
			System.out.print(d+" ");
		}
		}
	}


