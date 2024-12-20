package multiThreading;

class Resource1
{
	private int data;
	boolean isdatapresent=false;

	public synchronized void getData() {
		try
		{
			if(isdatapresent==true)
			{
				System.out.println("Consumed"+data);
				isdatapresent=false;
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
		
	

	public synchronized void setData(int data) {
		try
		{
			if(isdatapresent==false)
			{
			this.data = data;
			System.out.println("Produced "+data);
			isdatapresent=true;
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
class Producer extends Thread
{
	Resource1 r;
	@Override
	public void run() {
		int i=1;
		for(;;)
		{
			r.setData(i++);
		}
		
	}
	Producer(Resource1 r)
	{
		this.r=r;
	}
}

class Consumer extends Thread
{
	Resource1 r;
	@Override
	public void run() {
		for(;;)
		{
			r.getData();
		}
		
	}
	Consumer(Resource1 r)
	{
		this.r=r;
	}
}
public class ConsumerProducerProblem {
	public static void main(String args[])
	{
		Resource1 obj=new Resource1();
		Producer p=new Producer(obj);
		Consumer c=new Consumer(obj);
		p.start();
		c.start();
	}
}


