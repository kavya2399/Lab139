package com.cap.lab13;


	interface Printable1
	{
		void print();
	}


	public class Factoriall {
		
		public  void factorial(){  
			  int i,fact=1;  
			   int num=10;                  //It is the number to calculate factorial    
			  for(i=1;i<=num;i++)
			  {    
			      fact=fact*i;    
			  }    
			  System.out.println("Factorial is: "+fact);   
			 }  


		public static void main(String[] args) {  
	        Factoriall methodReference = new Factoriall(); // Creating object  
	        
	        
	        
	        // Referring non-static method using reference  
	           Printable1 printable = methodReference::factorial ;  
	        // Calling interface method  
	            printable.print();  
	            
	    }
		
		
		
		
	}


