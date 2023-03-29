package coreJava;

import java.util.Scanner;

public class user_define {
public static void main(String[] args) {
	int a,b,c;	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter  A :");
	a=sc.nextInt();
	System.out.print("Enter B :");
	b=sc.nextInt();
	c=a+b;
	System.out.println("Add :"+c);
}
}
