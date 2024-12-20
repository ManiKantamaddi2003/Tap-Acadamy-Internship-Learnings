package tap;
class OS
{
	private String name;
	private int size;
	OS(String name,int size)
	{
		this.name=name;
		this.size=size;
		
	}
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}
}
class Charger
{
	private String brand;
	private float voltage;
	Charger(String brand,float voltage)
	{
		this.brand=brand;
		this.voltage=voltage;
	}
	public String getBrand() {
		return brand;
	}
	public float getVoltage() {
		return voltage;
	}
	
}
class Mobile{
	OS obj=new OS("ANdroid",64);
	void hasA(Charger C)
	{
		System.out.println(C.getBrand());
		System.out.println(C.getVoltage());
	}
}

public class AggcompExample {
	public static void main(String args[])
	{
		Mobile mobi=new Mobile();
		Charger C=new Charger("Samsung",45.6f);
		mobi.hasA(C);
		System.out.println(mobi.obj.getName());
		System.out.println(mobi.obj.getSize());
		mobi=null;
//		System.out.println(mobi.obj.getName()); //composition(part-of)//tightBond
//		System.out.println(mobi.obj.getSize());
		System.out.println(C.getBrand());//Aggregation(has-A)//loosely bound
		System.out.println(C.getVoltage());
		
		
	}

}
