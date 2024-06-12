package com.ruby.java.test1;

public class Armor {
	String name="John";
	int height=185;
	int weight=100;
	String color="RED";
	boolean isFly=true;
	
	void setData(String n, int h, int w, String c) {
		name=n;
		height=h;
		weight=w;
	}
	
	void setName(String str){
		name = str;
	}
	void setHeight(int h){
		height = h;
	}
	void setWeight (int w) {
		weight = w;
	}
//	{
////		System.out.println("takeOff 매서드가 호출되었습니다.");
////		return isFly;
//	}
	
}