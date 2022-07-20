package com.globalLogic.strings;
import java.util.*;
public class ArrayList1 {
public static void main(String args[]) {

	ArrayList<String>Student=new ArrayList<>();
	Student.add("Isha");
	Student.add("Manas");
	Student.add("Shashwat");
	Student.add("Suraj");
	Student.add("Yash");
	
	 ArrayList<Integer>marks=new ArrayList<>();
	 marks.add(89);
	 marks.add(80);
	 marks.add(90);
	 marks.add(98);
	 marks.add(90);
	 Student.remove(0);
	 marks.remove(0);
	 System.out.println("Sorted ArrayList");
	   Collections.sort(Student);
	   Collections.sort(marks);
	   for(String s:Student) {
		   System.out.println(s);
	   }
	 for(Integer s2:marks) {
		 System.out.println(s2);
	 }
	 System.out.println("Sorted ArrayList ReverseOrder");
	  Collections.sort(Student,Collections.reverseOrder());
	  Collections.sort(Student,Collections.reverseOrder());
}
}
