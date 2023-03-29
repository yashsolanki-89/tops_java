package coreJava;

import java.util.Scanner;

public class if_Condition {
public static void main(String[] args) {
	int a;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter A :");
	a=sc.nextInt();
			
	if(a>0)
	{
		System.out.println("A is positive");
	}
	else
	{
		System.out.println("A is negative");
	}
}
}
