package com.juby.java.ch11;

public class NegativeNumberException extends Exception {
	public NegativeNumberException() {
		super("음수는 허용되지 않습니다");
	}
}
