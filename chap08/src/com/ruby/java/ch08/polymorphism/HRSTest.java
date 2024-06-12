package com.ruby.java.ch08.polymorphism;

abstract class Employee {
	String name;
	int salary;
	
	public abstract void calcSalary();
}

	class Salesman extends Employee {
		int annual_sales;
		public void calcSalary() {//calcSalary() 추상메서드를 구현했다
			System.out.println("Salesman 급여 = 기본급 + 판매 수당");
		}
	}

	class Consultant extends Employee {
		int num_project;
		public void calcSalary() {
			System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
		}
	}

	class Director extends Employee {
		public void calcSalary() {
			System.out.println("Employee 급여 = 기본급 + 팀 성과 수당");
		}

	}
	
	class Manager extends Employee {
		int num_team;
		public void calcSalary() {
			System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
		}

	}
	


public class HRSTest {
	public static void calcTax(Employee e) {
		if (e instanceof Salesman) {
			Salesman s = (Salesman) e;
			s.annual_sales = 6500000;
			System.out.println("Salesman입니다 "+s.annual_sales);
		} else if(e instanceof Manager) {
			Manager m = (Manager) e;
			m.num_team = 5;
			System.out.println("Manager입니다 "+m.num_team);
		} else if(e instanceof Consultant) {
			Consultant c = (Consultant) e;
			c.num_project = 35;
			System.out.println("Consultant입니다 "+c.num_project);
		} else {
			System.out.println("Employee입니다 ");
		}
	}

		public static void main(String[] args) {
			Salesman s = new Salesman();
			Manager m = new Manager();
			Consultant c = new Consultant();
			
			calcTax(s);
			calcTax(m);
			calcTax(c);
		}
	}
//	
//	{
//		
//		System.out.println("소득세를 계산합니다");
//	}
//	
//	public static void main(String[] args) {
//		Salesman s1 = new Salesman();
//		Employee s2 = new Salesman();
//		Object s3 = new Salesman();
//		
//		Object m1 = new Manager();
//		Employee m2 = new Manager();
//		Manager m3 = new Manager();
//		
//		Object arr[]= new Object[6];
//		arr[0]= s1;
//		arr[1]= s2;
//		arr[2]= s3;
//		arr[3]= m1;
//		arr[4]= m2;
//		arr[5]= m3;
//		
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		
////		Consultant c = new Consultant();
//		Director d = new Director();
//		
////		calcTax(s);
////		calcTax(c);
////		calcTax(d);
//		System.out.println(s.toString());
//		System.out.println(c.toString());
//		System.out.println(d.toString());
//		
//		Salesman s2 = s;
//		System.out.println(s2.toString());
//		
//		if(s.equals(s2)) {
//			System.out.println("동일한 객체입니다.");
//		}else {
////			System.out.println("서로 다른 객체입니다.");
////		}
//	}
//}

