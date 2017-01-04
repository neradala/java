package com.niit;

public class Srikanth {
 public int c;
 public String name ;
 public int age ; 

public Srikanth(int a,String d,int l)
{
c=a;

 name=d;

 age=l;


}

void display()
{	

	System.out.println(c+" "+name+" "+age);
	
}
public static void main(String[] args){
	
	Srikanth obj=new Srikanth(23,"kiran",43);
	obj.display();
	
}
}