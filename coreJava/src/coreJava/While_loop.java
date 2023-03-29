package coreJava;

import java.util.Scanner;

public class While_loop {
public static void main(String[] args) {
	int a;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter A :");
	a=sc.nextInt();
	
	while(a>0)
	{
		System.out.println("Hello");
		a--;
	}
}
}
