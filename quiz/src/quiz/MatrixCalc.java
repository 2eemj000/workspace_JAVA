package quiz;

import java.util.Random;
import java.util.Scanner;

public class MatrixCalc {
	
//	matrix가 3*3으로 고정되어 있을 때
	private int [][] matrix = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
	
	};
	
//	matrix가 고정되어 있지 않을 때 (입력받아서 실행)
	private void getMatrix() {
		Scanner sc = new Scanner(System.in);
		
//	랜덤생성자 만들기
		Random rd = new Random();
		
//		n,m 값 입력받음
		int n = sc.nextInt(10);
		int m = sc.nextInt(10);
		
		matrix = new int [n][m];
//		가로합 계산하기
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
//				랜덤 메트릭스 만들기
				matrix[i][j]=rd.nextInt(20);
			}
		}
		sc.close();
	}
	
	public void work(boolean flag) {
		if (flag) {
			getMatrix();
		}
	
		// 가로합 계산하기
		for (int i = 0; i < matrix.length; i++) {
			int sum1 = 0;
			for (int j = 0; j < matrix[0].length; j++) {
				sum1 += matrix[i][j];
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println(i + 1 + "번째 가로합 = " + sum1);
		}
		System.out.println();
		// 세로합 계산하기
		for (int j = 0; j < matrix[0].length; j++) {
			int sum2 = 0;
			for (int i = 0; i < matrix.length; i++) {
				sum2 += matrix[i][j];
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println(j + 1 + "번째 세로합 = " + sum2);
		}
	}
}
