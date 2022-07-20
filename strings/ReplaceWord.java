package com.globalLogic.strings;
import java.util.*;
public class ReplaceWord {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String s=sc.nextLine();
	System.out.println("Enter the substring");
	String sub=sc.nextLine();
	System.out.println("Enter the replacing string");
	String sub1=sc.nextLine();
	s=s.replace(sub,sub1);
	System.out.println(s);
}
}


