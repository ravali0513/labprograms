package com.capg.demo;

import java.util.*;
 
class Student{
	int age;
	String name;
	double height;
	 public Student(String name,int age,double height) {
		 super();
		 this.name=name;
		 this.age=age;
		 this.height=height;
		  }
	 public String toString() {
		 return this.age +" " + this.name +
				           " " +this.height;
		  }
	}
class Sortbyage implements Comparator<Student>{

	@Override
	public int compare(Student a, Student b) {
		
		return a.age - b.age;
	}
	
}
class sortbyname implements Comparator<Student>{

	@Override
	public int compare(Student a, Student b) {
		
		return a.name.compareTo(b.name);
	}
	
}
class Sortbyheight implements Comparator<Student>{

	@Override
	public int compare(Student a, Student b) {
		
		return (int)(a.height-b.height);
	}
	
}
public class Example2 {

	public static void main(String[] args) {
		ArrayList<Student> ar=new ArrayList<Student>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of students:");
		int n=sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("enter the student details:");
			System.out.println("Name:");
			String name =sc.next();
			System.out.println("Age");
			int age=sc.nextInt();
			System.out.println("Height");
			double height=sc.nextDouble();
			Student s=new Student(name,age,height);
			ar.add(s);
			}
		System.out.println("unsorted");
		for(int i=0; i<ar.size();i++)
			System.out.println(ar.get(i));
		
		Collections.sort(ar,new Sortbyage());
		
		System.out.println("\nSorted by age");
		for(int i=0; i<ar.size();i++)
			System.out.println(ar.get(i));
		
		Collections.sort(ar,new sortbyname());
		
		System.out.println("\nSorted by name");
		for(int i=0; i<ar.size();i++)
			System.out.println(ar.get(i));
		
		
        Collections.sort(ar,new Sortbyheight());
		
		System.out.println("\nSorted by height");
		for(int i=0; i<ar.size();i++)
			System.out.println(ar.get(i));
		
		}

}



