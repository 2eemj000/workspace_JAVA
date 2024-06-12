package quiz;

import java.util.Scanner;

public class PrimeNumber1 {
	public static void main(String[]args) {
	try(Scanner sc = new Scanner(System.in)){
		while(true) {
			System.out.println("Number[0:exit]: ");
			int num = sc.nextInt();
			if (num==0) break;
			if (isPrime(num)==true) System.out.println(num+"은 소수입니다");
			else System.out.println(num+"은 소수가 아닙니다");
		}
	}
	System.out.println("DONE");
	}
	public static boolean isPrime(int n) { //isPrime 선언
		if (n==1) return false;
		if (n==2 || n==3) return true;
		// i가 <2부터 n의 제곱근>까지 나눠서 나머지가 0인 경우가 나오면 소수가 아니다 출력
		for (int i =2; i<=Math.sqrt(n); i++) { 
			if(n%i==0)
				return false;
		}
		return true;
	}
}
