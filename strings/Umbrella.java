package com.globalLogic.strings;

public class Umbrella {
public static void main(String args[]) {
	String s="Umbrella";
	int len=s.length();
	char ch;
	for(int i=0;i<len;i++) {
		ch=s.charAt(i);
		if(ch=='e') {
		  System.out.println("e is present");
		  break;
		}
	}
}
}
