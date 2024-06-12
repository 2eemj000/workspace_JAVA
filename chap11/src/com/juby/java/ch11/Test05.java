package com.juby.java.ch11;

public class Test05 {
	int battery = 0;
	
	public void charge(int time) throws Exception{ // throws NegativeNumberException해도되고
		if(time<0) {
			time=0;
			try {
				throw new NegativeNumberException();
			}catch(NegativeNumberException e) {
				e.printStackTrace();
			}
		}
		battery += time;
		System.out.println("현재 배터리 : "+battery);
	}

	public static void main(String[] args) {
		Test05 test = new Test05();
		test.charge(20); //1 -> 현재 배터리 출력
		test.charge(-10); //2 -> 예외 던짐
	}
}
