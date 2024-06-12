package chap04;

public class Test36 {
	public static void main(String[] args) {
		int arr[][]= new int[5][5];
		for (int i=0; i<arr.length;i++)
			for (int j=0; j<arr.length;j++)
		{
			arr[i][j]=i*5+j+1;
		}
		for(int[] n:arr)
			for (int k: n)
				
		System.out.print(k+ " ");
}
}
