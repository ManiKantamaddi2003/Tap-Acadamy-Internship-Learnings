package multiThreading;
class Queue
{
	private int data;
	boolean isFull=false;
	
	public synchronized void setData(int data)
	{
		try
		{
			if(isFull==false)
			{
			this.data=data;
			System.out.println("Produced "+data);
			isFull=true;
			notify();
			}
			else
			{
				wait();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public synchronized void getData()
	{
		try
		{
			if(isFull==true)
			{
				System.out.println("Consumed"+data);
				isFull=false;
				notify();
			}
			else
			{
				wait();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}

class Producer1 extends Thread
{
	Queue r;
	@Override
	public void run() {
		int i=1;
		for(;;)
		{
			r.setData(i++);
		}
		
	}
	Producer1(Queue r)
	{
		this.r=r;
	}
}

class Consumer1 extends Thread
{
	Queue r;
	@Override
	public void run() {
		for(;;)
		{
			r.getData();
		}
		
	}
	Consumer1(Queue r) {
		this.r=r;
	}
}


public class ConsProudProblem {
	public static void main(String args[])
	{
		Queue obj=new Queue();
		Producer1 obj1=new Producer1(obj);
		Consumer1 obj2=new Consumer1(obj);
		
		obj1.start();
		obj2.start();
	}

}
