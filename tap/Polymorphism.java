package tap;
class Plane1
{
	void fly()
	{
		System.out.println("PLANE FLIES");
	}
}
class CargoPlane extends Plane1
{
	void fly()
	{
		System.out.println("CARGO PLANE FLIES");
	}
}
class FighterPlane extends Plane1
{
	void fly()
	{
		System.out.println("FIGHTER PLANE FLIES");
	}
}
class PassengerPlane extends Plane1
{
	void fly()
	
		{
			System.out.println("PASSENGER PLANE FLIES");
		}
	
}
class Airpart
{
	void permit(Plane1 ref)
	{
		ref.fly();
	}
}

public class Polymorphism {
	public static void main(String args[])
	{
		CargoPlane cp=new CargoPlane();
		FighterPlane fp=new FighterPlane();
		PassengerPlane pp=new PassengerPlane();
		
//		cp.fly();
//		fp.fly();
//		pp.fly();
//		Plane ref;
//		ref=cp;
//		ref.fly();
//		ref=fp;
//		ref.fly();
//		ref=pp;
//		ref.fly();
		Airpart obj=new Airpart();
		obj.permit(cp);
		obj.permit(fp);
		obj.permit(pp);
	}

}
