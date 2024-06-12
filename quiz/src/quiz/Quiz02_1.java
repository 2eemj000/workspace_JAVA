package quiz;

import java.util.Scanner;

public class Quiz02_1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("0보다 큰 정수를 입력하시오.");
		int n=sc.nextInt();
		
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		for(int i=1;i<=n;i++) {
			sum+=i;  //sum=sum+i;
			if (i%2==0)
				sum2+=i;
			else
				sum1+=i;
		}
		System.out.println("전체합은 "+(sum)+"입니다.");
		System.out.println("홀수합은 "+(sum1)+"입니다.");
		System.out.println("전체합은 "+(sum2)+"입니다.");
	}
}
