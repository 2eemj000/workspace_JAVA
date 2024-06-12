package quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("숫자[0:exit]:");
			int n=sc.nextInt();
			if (n==0)
				break;
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
		System.out.println("종료");
	}
}
