package com.krishna;

public class E {
	public static void main(String[]args){
		R obj=new R();
		obj.money();
		obj.snake();
	}		
}

interface T{
	void money();
	
}
interface V{
	void snake();
	
}

 class R implements T,V{
	public  void money()
 
	 {
		 System.out.println("complete the work in day");
	 }
 
public void snake ()
	 {
		 System.out.println("complete the work per hour");
	 }
 }
 	 
	 
 