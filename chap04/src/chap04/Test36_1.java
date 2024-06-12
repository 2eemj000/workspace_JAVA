package chap04;

public class Test36_1 {
	public static void main(String[] args) {
		int[][]arr= new int[5][5];
		int num=1;
	
		for (int i=0; i<arr.length;i++) {
			for (int j=0; j<arr[i].length;j++) {
				arr[i][j]=num++;
				if (arr[i][j]<10) {
					System.out.print(" ");
				}
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
