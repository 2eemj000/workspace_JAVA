package com.ruby.java.test1;

public class Test {

	public static void main(String[] args) {

		Armor armor = new Armor();
		
		armor.setData("CIA", 200, 150, "BLUE");
		System.out.println(armor.name);
		System.out.println(armor.height);
		System.out.println(armor.weight);
		System.out.println(armor.color);
		
//		System.out.println(armor.name);
//		armor.setName("CIA");
//		System.out.println(armor.name);
//		System.out.println(armor.height);
//		armor.setHeight(180);
//		System.out.println(armor.height);
//		System.out.println(armor.weight);
//		armor.setWeight(90);
//		System.out.println(armor.weight);
		
//		boolean ret=armor.takeOff();
//		if(ret)
//			System.out.println("날 수 있습니다.");
//		else
//			System.out.println("날 수 없습니다.");
	}
}