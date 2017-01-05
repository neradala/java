package com.kri;

 class U{
 public static void main(String[]args){
	 L obj=new L();
	 obj.display();
 }
}
	
class N extends U{
	void display(){
		
	System.out.println("print o");
	}
	}
	class H extends N{	
		void display(){
			System.out.println("print s");
		}	
		}
		class L extends H{
			void display(){
				System.out.println("print k");
				
			}
				
			}
		
	
		
	
	
