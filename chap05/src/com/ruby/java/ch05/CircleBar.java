package com.ruby.java.ch05;

import java.util.Scanner;

public class CircleBar {
	static int r = 5;//반지름
	static int h = 10; //높이
	
	//부피구하기 
	static double getVolume() {
		return Math.PI*r*r*h;
	}
	//표면적구하기
	static double getArea() {
		return Math.PI*r*r*2+(2*Math.PI*r)*h;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("반지름[0:exit]: ");r=sc.nextInt();
			if (r==0)
				break;
			System.out.print("높이[0:exit]: ");h=sc.nextInt();
			if (h==0)
				break;
			System.out.println("Volume: "+(int)getVolume());
			System.out.println("Area: "+(int)getArea());
		}
		System.out.println("Done");
		sc.close();
	}
	
}
