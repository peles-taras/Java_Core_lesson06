package com.lgs.lab.interface2;

public class Main {

	public static void main(String[] args) {
		
		MyCalculator mc = new MyCalculator(10, 5);

		mc.plus();
		mc.minus();
		mc.multiply();
		mc.devide();

		System.out.println(mc.plus());
		System.out.println(mc.minus());
		System.out.println(mc.multiply());
		System.out.println(mc.devide());

	}

}
