package chap03;

import java.util.Scanner;

public class Test22 {
	public static void main(String[]args) {
//		int a =12;
//		int b=2;
//		char op='+';
		//표준입력장치로부터 입력을 받기 위한 객체를 생성한다.
		Scanner sc = new Scanner(System.in);
		//정수형 값을 입력받아 변수 a에 저장한다.
		System.out.print("첫번째 점수:");
		int a = sc.nextInt();
		
		System.out.print("두번째 점수:");
		int b = sc.nextInt();
		
		System.out.print("op:");
		String ops=sc.next();
		char op=ops.charAt(0);
		

		switch (op){
			case '+':
				System.out.println(a+b);break;
			case '-':
				System.out.println(a-b);break;
			case '*':
				System.out.println(a*b);break;
			case '/':
				System.out.println(a/b);break;
		}
	}
}
