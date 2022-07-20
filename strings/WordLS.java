package com.globalLogic.strings;

public class WordLS {
public static void main(String args[]) {
	String s="This is an umbrella";
	String arr[]=s.split(" ");
	int len=arr.length;
	int largest=Integer.MIN_VALUE;
	int smallest=Integer.MAX_VALUE;
	String small="";
	String large="";
	for(int i=0;i<len;i++) {
	  
	if(arr[i].length()>largest) {
		largest=arr[i].length();
		large=arr[i];
	}
	if(arr[i].length()<smallest) {
		smallest=arr[i].length();
		small=arr[i];
	}
}
	System.out.println("Largest word is "+large);
	System.out.println("Smallest word is "+small);
	
}
}
