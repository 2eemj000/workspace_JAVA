package com.ruby.java.ch13.generic;
/*
 * 객체를 정렬하는 코드 완성 
 * 스트링 배열을 정렬
 * 객체 배열을 정렬 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.Comparator;
import java.util.Random;
class Sno{}
class Sname{}

class Student<T,U>{
	List<T> snos = new ArrayList<>();
	List<U> snames = new ArrayList<>();
	
	public void add(T sno, U sname) {
		snos.add(sno);
		snames.add(sname);
	}
}

class SnoComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // 학번을 기준으로 비교
    	
    	int sno = Integer.parseInt(sno); 
        return s1.sno.compareTo(s2.sno); // 학번이 String으로 되어있어서 compareTo 쓰기
    }
}
public class test_객체배열정렬소스 {

	static void showData(String msg, Object[]data) {
		
	}
	public static void main(String[] args) {
		String [] stringData = {"apple","grape","blueberry","banana"};
		Student [] data = {
				new Student("12", "홍길동"),
				new Student("121", "홍길순"),
				new Student("213", "홍길춘"),
				new Student("9", "홍길홍")
		};
		showData("정렬전", stringData);
		Arrays.sort(stringData);
		showData("정렬후", stringData);
		showData("정렬전", data);
		
		Arrays.sort(data, new SnoComparator());
		showData("정렬후", data);
	}

}
