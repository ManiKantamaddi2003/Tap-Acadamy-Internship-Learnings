package multiThreading;
class Resource
{
	synchronized void resourses()
	{
		try
		{
			System.out.println(Thread.currentThread().getName()+" is Executing 1");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" is Executing 2");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" is Executing 3");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" is Executing 4");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" is Executing 5");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
class One extends Thread
{
	Resource r;
	@Override
	public void run() {
		r.resourses();
		
	}
	public One(Resource r) {
		// TODO Auto-generated constructor stub
		this.r=r;
	}
}
class Two extends Thread
{
	Resource r;
	@Override
	public void run() {
		r.resourses();
		
	}
	public Two(Resource r) {
		// TODO Auto-generated constructor stub
		this.r=r;
	}
}
class Three extends Thread
{
	Resource r;
	@Override
	public void run() {
		r.resourses();
		
	}
	public Three(Resource r) {
		// TODO Auto-generated constructor stub
		this.r=r;
	}
}


public class SynchronizedExample {
	public static void main(String args[])
	{
		Resource obj=new Resource();
		One obj1=new One(obj);
		Two obj2=new Two(obj);
		Three obj3=new Three(obj);
		
		//renaming threads
		obj1.setName("One");
		obj2.setName("Two");
		obj3.setName("Three");
		
		// run the threads
		
		obj1.start();
		obj2.start();
		obj3.start();
	}

}
