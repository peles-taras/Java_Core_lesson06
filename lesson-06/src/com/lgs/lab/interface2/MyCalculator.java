package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {

	private int x;
	private int y;

	MyCalculator(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int plus() {
		return x + y;
	}

	@Override
	public int minus() {
		return x - y;
	}

	@Override
	public int multiply() {
		return x * y;
	}

	@Override
	public int devide() {
		return x / y;
	}

	@Override
	public String toString() {
		return "MyCalculator [x=" + x + ", y=" + y + "]";
	}

}
