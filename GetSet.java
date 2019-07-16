package com.cap.lab13;

	interface Printable{  
	    void print();  
	}  
	public class GetSet {  
		
	  
		int id;
		String name;
		
		
		public GetSet() {
			// TODO Auto-generated constructor stub
		}
		
		
	    public GetSet(int id, String name) {
			
			this.id = id;
			this.name = name;
		}


		public void saySomething(){  
	        System.out.println("Welcome to java");  
	    }  
	   
		

		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		} 
		
		public static void main(String[] args) {  
	        GetSet methodReference = new GetSet(); // Creating object  
	        // Referring non-static method using reference  
	           Printable printable = methodReference::saySomething;  
	        // Calling interface method  
	            printable.print();  
	            
	    }

	 
	}  

