package com.ruby.java.ch08.innerClass;

public class MessengerTest {
	public static void main(String[] args) {
		
		Messenger test = new Messenger() {
	// 인터페이스명   변수명 = new 이름없는 클래스가 상속받는 객체(){
	// 인터페이스의 메서드 오버라이딩
	// }
			
			public void setMessage(String msg) {
				System.out.println("test에서 메시지를 설정합니다 : "+msg);
			}
			
			public String getMessage() {
				return "test";
			}
		};
		
		System.out.println(test.getMessage());
		test.setMessage("have a nice day!");
	}
}
