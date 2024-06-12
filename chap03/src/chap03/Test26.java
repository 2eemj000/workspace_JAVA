package chap03;

import java.util.Scanner;

public class Test26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하시오.");
		int k = sc.nextInt();
		int i = 0;
		while(i<k) {
			System.out.println(i);
			i++;
		}
		System.out.println("OK");
	}

}
