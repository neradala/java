package com.kri;

  class A {
public static void main(String[]args){
	R obj=new R();
	obj.school();
}

}
    abstract class T{
	abstract void school();
}
	 
	 class C extends T { 	 
		 void school(){
			 System.out.println("print b");
		 }

	
	 }
	
class R extends C{
 void school()
 {
	 System.out.println("gold coine");
 }
}
 
  

	


