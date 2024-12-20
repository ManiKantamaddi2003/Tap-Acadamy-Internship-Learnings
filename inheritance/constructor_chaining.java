package inheritance;
class test1
{
	int x,y;
	test1()
	{
		x=100;
		y=200;
	}
	test1(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}
class test2 extends test1
{
	int a,b;
	test2()
	{
		this(1,2);
		a=10;
		b=20;
	}
	test2(int a,int b)
	{
		//super(a,b);
		this.a=a;
		this.b=b;
	}
	void display()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
	}
}
public class constructor_chaining {
	public static void main(String args[]) {
		test2 obj=new test2();
		obj.display();
		
	}

}
