package com.ruby.java.ch14;


interface StringFunc {
	String modify(String s);
}
//추상메서드 modify()가 선언된 함수형 인터페이스 StringFunc 선언

public class Test07 {
	static String test(StringFunc sf, String s) {
		return sf.modify(s); //매개변수로 전달받은 modify() 메서드를 호출, test의 두번째 매개변수s값 전달
							 //-> test()메서드는 람다식을 실행한 후 반환된 값을 다시 반환
	}

	public static void main(String[] args) {

		String str = "Korea,Australia,China,Germany,Spain,Turkey";
		StringFunc sf1 = (s) -> {
			//StringFunc의 modify 메서드 호출 시 전달받은 인자값을 매개변수s에 저장함
			String result = "";
			char c;
			for (int i = 0; i < s.length(); i++) {
				c = s.charAt(i); //s에서 i번째 문자를 반환
				if (c == ',')
					result += " "; //c가 ,이면 result에 공백 추가
				else
					result += c; //아니면 문자그대로 result에 추가
			}
			return result;
		};

		String s1 = test(sf1, str); //test() 메서드를 호출하면서 첫번째인자는 람다식sf1, 두번째인자는 문자열 str전달
 		System.out.println(s1);

		String s2 = test((s) -> { //(s)는 modify 추상메서드를 구현한 class, 익명객체를 만
			int max = 0;
			int index = 0;
			String[] word = s.split(",");
			for (int i = 0; i < word.length; i++) {
				if (max < word[i].length()) {
					max = word[i].length();
					index = i;
				}
			}
			return word[index]; //word 배열 중 길이가 가장 긴 단어를 반환
		}, str);
		System.out.println(s2);
	}
}