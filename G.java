package com.krishna;

public class G {
	public static void main (String[]args){
	C obj=new C();
	obj.deer();
	obj.lion();
	obj.tiger();
	}

}




interface A{
	void tiger();
	
	
}

interface J extends A{
public 	void lion();
	
}
class C implements J{
	 void deer()
	{
		System.out.println("find deer in forest");
		
	}
public 	 void lion()
	{
		System.out.println("find the lion and play with lion");
		
	}
	 public void tiger ()
	{
		System.out.println("find the tiger ane play with tiger");
		
	}
	}
