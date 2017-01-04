package com.niit;

public class Gopi {
	int a;
	String name;
	
	Gopi(int a,String name)
	{
this. a=a;
this. name=name;
	}
void gopal()
{
	System.out.println(a+""+name);
	
}
	public static void main(String[]args){
		Gopi s =new Gopi(33,"kiran");
		s.gopal();
	}
}
