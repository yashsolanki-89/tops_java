package coreJava;
/*
 * Method overloading : when there is a more than one method in a single class having the same name but with different number of arguments & their data types then it is called method  overloading
 */
public class Method_overloading {
	void test() {
		System.out.println("no argument");
	}
	void test(int a) {
		System.out.println("1 argument");
	}
	void test(int a,int b) {
		System.out.println("2 argument");
	}
public static void main(String[] args) {
	Method_overloading m=new Method_overloading();
	m.test();
	m.test(5);
	m.test(34, 55);
   }
}
