package quiz;

public class DrinkOrder {
	public static void main(String[]args) {
		Drinks arr[] = new Drinks[5];
		arr[0] = new Juice();
		arr[1] = new Coffee();
		arr[2] = new Beer();
		arr[3] = new Water();
		arr[4] = new Tea();
		
		for(int i=0;i<arr.length;i++)
			arr[i].drinks();
	}	
}
	
	//추상클래스
	abstract class Drinks{
		abstract void drinks(); 
	}
		
	class Juice extends Drinks{
		void drinks() {
			System.out.println("주스를 마십니다");
		}
	}
	class Coffee extends Drinks{
		void drinks() {
			System.out.println("커피를 마십니다");
		}
	}
	class Beer extends Drinks{
		void drinks() {
			System.out.println("맥주를 마십니다");
		}
	}
	class Water extends Drinks{
		void drinks() {
			System.out.println("물을 마십니다");
		}
	}
	class Tea extends Drinks{
		void drinks() {
			System.out.println("차를 마십니다");
		}
	}

