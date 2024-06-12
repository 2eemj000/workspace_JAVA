package quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.print("첫번째 수를 입력하시오.");
	int p=sc.nextInt();
	
	System.out.print("두번째 수를 입력하시오.");
	int q=sc.nextInt();
	
	System.out.println("몫은 "+ (p-p%q)/q+"이고 나머지는 "+(p%q)+"입니다.");
	
	}

}
