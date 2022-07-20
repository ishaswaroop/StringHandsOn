package com.globalLogic.strings;
import java.util.Scanner;
public class RevWord {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String s=sc.nextLine();
	String arr[]=s.split(" ");
	int len=arr.length;
	String m="";
	String n="";
	int len2;
	for(int j=0;j<len;j++) {
		n=arr[j];
		len2=arr[j].length();
	for(int i=len2-1;i>=0;i--) {
	  m=m+n.charAt(i);
	}
	System.out.print(m+" ");
	m="";
}
}
}
