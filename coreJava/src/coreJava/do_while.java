package coreJava;

import java.util.Scanner;

public class do_while {
public static void main(String[] args) {
	int a ,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter A :");
	a=sc.nextInt();
	
	do {
		sum=sum+a;
		a--;
	}
	while(a>0);
	System.out.println("Sum :"+sum);
}
}
