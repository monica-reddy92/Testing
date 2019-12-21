package com.CoreJava;

public class While_Break 
{
	public static void main(String[] args) 
	{
	int i=1;
	while(i<=5)
	{
		System.out.println(i);
		
		while(i<=3)
		{
			System.out.println(i);
			
			if(i==2)
			{
				break;
				
			}
			i++;
		}
		i++;
		}
}
	
}
