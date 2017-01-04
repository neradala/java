package com.niit;

 class dileep {
	int a;
 String b;
	
 dileep(int n,String m){
		a=n;
		 b=m;
	}
	void ganesh(){
		System.out.println(a+""+b);
	}
   public static void main(String[]args){
	   
	   dileep obj=new dileep(234,"kiran");
	   
	   dileep obj1 =new dileep(345,"sai")
	   ;
	   dileep obj2=new dileep(343,"balu");
	   
	   obj.ganesh();
	   obj1.ganesh();
	   obj2.ganesh();
	   
   }
}
