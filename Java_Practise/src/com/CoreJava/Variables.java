package com.CoreJava;

public class Variables {

	static int a=20; //static variable
	int b=30; //instance variable
	
	void meth1()
	{
	int a=10; //local variable
	System.out.println(a);
	}
	
	void meth2()
	{
		System.out.println(a);
		a++;
		System.out.println(a);
		System.out.println(b);
		b++;
		System.out.println(b);
	}
	
	public static void main(String[] args) 
	{
	
	 //Local variables
	  Variables v=new Variables();
	  v.meth1();
	  Variables v1=new Variables();
	  Variables v2=new Variables();
	  v1.meth2();
	  v2.meth2();
	  
	}

}
