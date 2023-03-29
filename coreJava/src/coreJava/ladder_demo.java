package coreJava;

import java.util.Scanner;

public class ladder_demo {
public static void main(String[] args) {
	int rno,s1,s2,s3,total;
	String sname;
	double per;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter name :");
	sname=sc.next();
	System.out.print("Enter roll no :");
	rno=sc.nextInt();
	System.out.print("Enter s1 :");
	s1=sc.nextInt();
	System.out.print("Enter s2 :");
	s2=sc.nextInt();
	System.out.print("Enter s3 :");
	s3=sc.nextInt();
	total=s1+s2+s3;
	per=total/3;
	
	System.out.println("Name :"+sname );
	System.out.println("roll no:"+rno );
	System.out.println("Total :"+total );
	System.out.println("Percentage :"+per );
	
	
	if(per>70)
	{
		System.out.println("first class");
	}
	else if(per>60)
	{
		System.out.println("second class");
	}
	else if (per>40)
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
}
}
