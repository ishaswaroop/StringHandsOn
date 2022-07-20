package com.globalLogic.strings;
import java.util.*;
public class RepalcePalin {
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the String");
	 String s=sc.nextLine();
	 String arr[]=s.split(" ");
	 String final1="";
	 for(int i=0;i<arr.length;i++) {
		 String m="";
		for(int j=arr[i].length()-1;j>=0;j--) {
			m=m+arr[i].charAt(j);
			
		}
		if(arr[i].equals(m)) {
			int len2=arr[i].length();
			String n="";
			for(int k=0;k<len2;k++) {
				n=n+"*";
			}
			final1=final1+n+" ";
		}
		else {
			final1=final1+arr[i]+" ";
		}
		 
	 }
	 System.out.println(final1);
	 
 }
}
