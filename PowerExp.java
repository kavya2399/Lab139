package com.cap.lab13;

public class PowerExp {
	public static void main(String[] args) {
		PowerExpInt ex = (x,y)-> Math.pow(x, y);
		int res = ex.power(7, 2);
		System.out.println("power" +res);

}
}
