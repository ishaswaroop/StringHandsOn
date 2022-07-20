package com.globalLogic.strings;
import java.util.*;
public class FirstLastOccur {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String s="Hello World";
	System.out.println("First occurence of o "+s.indexOf("o"));
	System.out.println("Last occurence of o "+s.lastIndexOf("o"));
}
}
