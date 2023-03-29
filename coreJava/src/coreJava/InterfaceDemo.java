package coreJava;
interface ifs1
{
	void meth1();
	static void meth2()
	{
		System.out.println("meth2");
	}
	
}
interface ifs2 extends ifs1
{
	void meth3();
	void meth4();
}
public class InterfaceDemo implements ifs2 {

	
	public void meth1() {
	
	System.out.println("meth1");	
	}

	
	public void meth3() {
		System.out.println("meth3");
		
	}

		public void meth4() {
			System.out.println("meth4");
		
	}
public static void main(String[] args) {
	InterfaceDemo i=new InterfaceDemo();
	i.meth1();
	ifs1.meth2();
	i.meth3();
	i.meth4();
}
}

