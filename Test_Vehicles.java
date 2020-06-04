import java.util.Scanner;
abstract class Vehicle{
	boolean hashelmet;
	int yom;
	abstract void getData();
	abstract void putData();
	Vehicle(boolean h,int yom){
		this.hashelmet=h;
		this.yom=yom;
	}

}
class TwoWheeler extends Vehicle{
	private String brand;
	protected int cost;
	String etype;
	public String color;
	TwoWheeler(
}
final class FourWheeler extends Vehicle{

}

