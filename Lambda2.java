package com.cap.lab13;


	import java.util.Scanner;
	import java.util.function.UnaryOperator;
	public class Lambda2 {

	public static void main(String[] args) {
		UnaryOperator<String>uo=(str)->
		{String res =" ";
			for (int i = 0; i < str.length(); i++) {
			res+=str.charAt(i);
			if (i==str.length()-1) 
				break;
				res +=" ";
			
		}
			return res;
			};
			Scanner sc=new Scanner(System.in);
			System.out.println("enter string");
			String s=uo.apply(sc.next());
			System.out.println(s);
	}
	}



