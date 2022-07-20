package com.globalLogic.strings;
class Student<A,B,C,D,E>{
	A name;
	B city;
	C sub;
	D roll_no;
	E unique_id;
	public Student(A name, B city, C sub, D roll_no, E unique_id) {
		super();
		this.name = name;
		this.city = city;
		this.sub = sub;
		this.roll_no = roll_no;
		this.unique_id = unique_id;
	}
	public void print() {
		
		System.out.println("Name of the student is "+this.name);
		System.out.println("Name of the City is "+this.city);
		System.out.println("Name of the subject is "+this.sub);
		System.out.println("Roll_no of the student is "+this.roll_no);
		System.out.println("Unique id of the student is "+this.unique_id);
	}
}
public class GenericClass {
	public static void main(String args[]) {
           Student<Integer,Integer,Integer,Integer,Integer> a=new Student<>(1,2,3,4,5);
           Student<String,String,String,String,String> b=new Student<>("Isha","Lucknow","Maths","123","1567");
           a.print();
           b.print();
           
}
}
