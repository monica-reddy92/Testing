package com.CoreJava;

public class SwitchCase {

	public static void main(String[] args)
	{
		//Can be used for integers, characters, and strings and can also be nested
		String str1="Hi";
		String str2 = null,str3=null;
		switch(str1)
		{
		case "Hello":
			str2="Hello";
			break;
		case "Hi":
			switch(str1)
			{
			case "Hello":
				str3="Hello1";
				break;
			case "Hi":
				str3="Hi1";
				break;
			}
			str2="Hi";
			break;
		}
		System.out.println(str2+" "+str3);

	}

}
