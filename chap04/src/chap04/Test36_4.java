package chap04;

public class Test36_4 {
	public static void main(String[] args) {
		int[][]arr= new int[5][5];
		int num=1;

		for (int i=0; i<arr.length;i++) {
			for (int j=0; j<arr[i].length;j++) {
				arr[i][j]=num++;
					if(j<=i) {
					System.out.print(arr[i][j]+" ");
					} else {
						System.out.print("  ");
					}
			}
			System.out.println("");
		}
	}
}
