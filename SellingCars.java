class Car{
	int speed;
	double regprice;
	String color;
	Car(String color,int speed,double regprice){
		this.color=color;
		this.regprice=regprice;
		this.speed=speed;
	}
	double getSalePrice(){
		return regprice;
	}
}
class Truck extends Car{
	int weight;
	int discount;
	Truck(String color,int speed,double regprice,int weight){
		super(color,speed,regprice);
		this.weight=weight;
		if(weight>2000) discount=10;
		else discount=20;
	}
	double getSalePrice(){
		return super.getSalePrices()-dicount*regprice/100 ;
	}
}
class Ford extends Car{
	int year;
	int mdisc;
	Ford(String color,int speed,double regprice,int year,int mdisc){
		super(color,speed,regprice);
		this.year=year;
		this.mdisc=mdisc;
	}
	double getSalePrice(){
		return regprice-mdisc;
	}
}
public class SellingCar{
	public static void main(String args[]){

