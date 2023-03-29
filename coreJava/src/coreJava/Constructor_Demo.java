package coreJava;
 class box 
 {
	 double width,heigth,depth;
	 box()
	 {
		 System.out.println("Default constructor called ");
		 width=3;
		 heigth=4;
		 depth=5;
	 }
	 box(double w,double h,double d)
	 {
		 System.out.println("parameterized construtor called");
		 width=w;
		 heigth=h;
		 depth=d;
		 
	 }
	 box(box d)
	 {
		 System.out.println("copy contrutor called");
		 width=d.width;
		 heigth=d.heigth;
		 depth=d.depth;
	 }
	 void volume() {
		 System.out.println("Volume :"+(width*heigth*depth));
	 }
 }
public class Constructor_Demo {
public static void main(String[] args) {
	box b1=new box();
	b1.volume();
	
	box b2=new box(5,6,7);
	b2.volume();
	 
	box b3=new box(b1);
	b3.volume();
}
}
