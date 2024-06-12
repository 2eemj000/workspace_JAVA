package com.juby.java.ch11;

public class Test02 {
	public static void main(String[] args) {
		try {
			System.out.println("1");
			String s = null;
			s.length(); //값이 없어서 문자열 길이를 구할 수 없음
			System.out.println("2");
			System.out.println("3");
		} catch(Exception e) {
			System.out.println("오류발생");
		} finally {
			System.out.println("OK"); //무조건 실행
		}
		System.out.println("4");
	}
}


