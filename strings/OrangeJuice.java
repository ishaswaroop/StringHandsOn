package com.globalLogic.strings;

public class OrangeJuice {
 public static void main(String args[]) {
	 String s="This is Orange Juice";
	 String arr[]=s.split(" ");
	 for(int i=0;i<arr.length;i++) {
		 if(arr[i].equals("Orange")) {
			 System.out.println("The word orange is present in Orange Juice");
			 break;
		 }
	 }
 }
}
