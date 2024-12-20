package tap;

import java.util.Scanner;


interface Calculator
{
	void add();
	void sub();
}
class A implements Calculator
{
	@Override
	public void add() {
		int a=100;
		int b=200;
		System.out.println(a+b);
		
	}
	@Override
	public void sub() {
		int a=100;
		int b=200;
		System.out.println(a-b);
		
	}
	void hi()
	{
		System.out.println("SPECILIZED METHOD ACCESS VIA PARENT REFERENCE");
	}
}
class B implements Calculator
{
	Scanner scan=new Scanner(System.in);
	@Override
	public void add() {
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(a+b);
		
	}
	@Override
	public void sub() {
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(a-b);
		
	}
}
class poly
{
	void calculate(Calculator ref)
	{
		ref.add();
		ref.sub();
	}
}
public class InterfaceExample {
	public static void main(String args[]) {
		A obj1=new A();
		B obj2=new B();
	
		Calculator ref;
		ref=obj1;
		poly obj=new poly();
		obj.calculate(obj1);
		obj.calculate(obj2);
		((A)ref).hi();
	}

}
