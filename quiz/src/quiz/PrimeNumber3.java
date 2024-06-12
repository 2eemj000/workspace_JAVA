package quiz;

import java.util.Scanner;

public class PrimeNumber3 {
	public static void main(String[]args) {
	try(Scanner sc = new Scanner(System.in)){
		while(true) {
			System.out.println("Number[0:exit]: ");
			int num = sc.nextInt(); //num이 2이면
			if (num==0) break;
			
			// Math.power(double, double) => 첫번째인자는 밑수, 두번째 인자는 지수
			int s = (int)Math.pow(10.0, (double)(num-1)); // s = 10의 1승 
			int e = (int)Math.pow(10.0, (double)(num)); // s = 10의 2승
			int count = 0; //
			
			//isPrimeAll 함수
			public static boolean isPrimeAll(int n) { // isPrimeAll 함수정의
				int i=1;
				String s = String.valueOf(n); // 자른 수를 s로 받음
				while(true) {
					if (!isPrime(Integer.parseInt(s.substring(0,)))){ // 0번째부터 문자열 자르기
						return false;
						
					if (s.length()<i)
						break;
					}
					return true;
				}
			}
			
			//코드부
			for (int n=s; n<e; n++) { // n은 10부터 99까지 범위에서 1씩 키우면서 확인
				if (PrimeNumber1.isPrimeAll(n)) { // 위에서 정의한 isPrimeAll함수에서 true이면
					System.out.println(n); // n 값 출력
					count++; // count에도 1씩 더해줌
				}
			}
			System.out.println("Number of PrimeAll : " +count);
		}
	}
	System.out.println("DONE");
	}
}
