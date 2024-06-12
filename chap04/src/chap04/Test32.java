package chap04;

public class Test32 {

	public static void main(String[] args) {
		int[]a=new int[10];
		
		for (int i=1; i<10; i++) {
			System.out.println(a[i]=a[i-1]+10);
		}
	}
}
 