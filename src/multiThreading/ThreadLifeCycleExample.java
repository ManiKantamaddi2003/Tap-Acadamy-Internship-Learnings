package multiThreading;

class Warrior extends Thread
{
	String nuclearBomb1="BrahmaAstra";
	String nuclearBomb2="PashuPathaAstra";
	String nuclearBomb3="SarpaAstra";
	
	@Override
	public void run() {
		if(Thread.currentThread().getName()=="arjuna")
		{
			arjuna();
		}
		else
		{
			karna();
		}
	}
	
	void arjuna()
	{
		try
		{
			Thread.sleep(3000);
			synchronized (nuclearBomb1) {
				System.out.println(Thread.currentThread().getName()+" acquired BrahmaAstra");
				Thread.sleep(3000);
				synchronized (nuclearBomb2) {
					System.out.println(Thread.currentThread().getName()+" acquired PashuPathaAstra");
					Thread.sleep(3000);
					synchronized (nuclearBomb3) {
						System.out.println(Thread.currentThread().getName()+" acquired PashuPathaAstra");

						
					}
					
				}
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
//	void karna()
//	{
//		try
//		{
//			Thread.sleep(3000);
//			synchronized (nuclearBomb1) {
//				System.out.println(Thread.currentThread().getName()+" acquired BrahmaAstra");
//				Thread.sleep(3000);
//				synchronized (nuclearBomb2) {
//					System.out.println(Thread.currentThread().getName()+" acquired PashuPathaAstra");
//					Thread.sleep(3000);
//					synchronized (nuclearBomb3) {
//						System.out.println(Thread.currentThread().getName()+" acquired PashuPathaAstra");
//
//						
//					}
//					
//				}
//			}
//			
//		}catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//	}
	// Deadlock example
	void karna()
	{
		try
		{
			Thread.sleep(3000);
			synchronized (nuclearBomb3) {
				System.out.println(Thread.currentThread().getName()+" acquired SarpaAstra");
				Thread.sleep(3000);
				synchronized (nuclearBomb2) {
					System.out.println(Thread.currentThread().getName()+" acquired PashuPathaAstra");
					Thread.sleep(3000);
					synchronized (nuclearBomb1) {
						System.out.println(Thread.currentThread().getName()+" acquired BrahmaAstra");

						
					}
					
				}
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}

public class ThreadLifeCycleExample {
	public static void main(String args[])
	{
		Warrior obj1=new Warrior();
		Warrior obj2=new Warrior();
		
		obj1.setName("arjuna");
		obj2.setName("karna");
		
		obj1.start();
		obj2.start();
		
	}

}
