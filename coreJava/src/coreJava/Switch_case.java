package coreJava;

import java.util.Scanner;

public class Switch_case {
public static void main(String[] args) {
	int a,b,c,d;
	
	Scanner sc=new Scanner(System.in);
	System.out.println(" 1. Addtion");
	System.out.println(" 2. subtration");
	System.out.println(" 3. multiplication");
	System.out.println(" 4. division");
	System.out.print("choose number :");
	d=sc.nextInt();
	
	System.out.print("Enter A :");
	a=sc.nextInt();
	System.out.print("Enter B :");
	b=sc.nextInt();
	
	switch(d) {
	
	case 1:
		c=a+b;
		System.out.println("Addtion :"+c);
		break;
	case 2:
		c=a-b;
		System.out.println("substration :"+c);
		break;
	case 3:
		c=a*b;
		System.out.println("multiplication :"+c);
		break;
	case 4:
		c=a/b;
		System.out.println("division :"+c);
		break;
	default :
		System.out.println("invalid");
	}
}
}
