package tap;
abstract class Plane
{
	abstract void fly();
	abstract void takeoff();
	abstract void land();
}
class CargoPlane1 extends Plane
{
	@Override
	void fly() {
		
		System.out.println(" CargoPlane Flies");
	}
	@Override
	void takeoff() {
		System.out.println("Cargoplane Takeoff");
		
	}
	@Override
	void land() {
		System.out.println("CargoPlane Lands");
		
		
	}
}
class FighterPlane1 extends Plane
{
	@Override
	void fly() {
		
		System.out.println(" FighterPlane Flies");
	}
	@Override
	void takeoff() {
		System.out.println("Fighterplane Takeoff");
		
	}
	@Override
	void land() {
		System.out.println("FighterPlane Lands");
		
		
	}
}
class PassengerPlane1 extends Plane
{
	@Override
	void fly() {
		
		System.out.println(" PassengerPlane Flies");
	}
	@Override
	void takeoff() {
		System.out.println("Passengerplane Takeoff");
		
	}
	@Override
	void land() {
		System.out.println("PassengerPlane Lands");
		
		
	}
}
class Airport
{
	void permit(Plane ref)
	{
		ref.fly();
		ref.takeoff();
		ref.land();
	}
}
public class AbstractionExample {
public static void main(String args[])
{
	Airport obj=new Airport();
	CargoPlane1 cp=new CargoPlane1();
	FighterPlane1 fp=new FighterPlane1();
	PassengerPlane1 pp=new PassengerPlane1();
	obj.permit(cp);
	obj.permit(fp);
	obj.permit(pp);
	}
}
