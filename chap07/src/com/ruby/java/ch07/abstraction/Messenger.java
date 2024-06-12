package com.ruby.java.ch07.abstraction;

public interface Messenger {
	//field 선언
	int MIN_SIZE = 1;
	int MAX_SIZE = 104857600;
	//메소드 선언
	public abstract String getMessage(); //추상메소드

	public abstract void setMessage(String msg);

	public default void setLogin(boolean login) { //default
		log();
		if (login) {
			System.out.println("�α��� ó���մϴ�.");
		} else {
			System.out.println("�α׾ƿ� ó���մϴ�");
		}
	}

	public static void getConnection() {
		System.out.println("network�� �����մϴ�.");
	}

	private void log() {
		System.out.println("start job!");
	}
}