package com.globalLogic.strings;
import java.util.*;
public class Palindrome {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String s=sc.nextLine();
	int len=s.length();
	String m="";
	for(int i=len-1;i>=0;i--) {
		m=m+s.charAt(i);
	}
	if(m.equals(s)) {
		System.out.println(s+" is Palindrome ");
	}
	else {
		System.out.println(s+" is Not Palindrome ");
	}
}
}
