package com.cap.lab13;

import java.util.Scanner;
import java.util.function.BiFunction;

import org.omg.PortableInterceptor.USER_EXCEPTION;

public class LambdaExp {
public static void main(String[] args) {
	BiFunction< String, String, Boolean>bf=(user,pass)->user.equals("prisha")&&pass.equals("prisha123");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter user and password");
	boolean b=bf.apply(sc.next(), sc.next());
	System.out.println(b);
	
}
}

