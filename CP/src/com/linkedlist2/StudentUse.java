package com.linkedlist2;

class Student {
	String name;
	int rollNo;

	Student(int num) {
		rollNo = num;
	}

	public void print(){
    System.out.print(name +" " + rollNo+" ");
    }
}

public class StudentUse {
	public static void main(String[] args) {
		Student s = new Student(12);
		s.print();
	}
}
