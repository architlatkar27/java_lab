abstract class Reservation{
	abstract boolean reserve(int seat,String type);
	abstract int getAvailable();
}
class ReserveTrain extends Reservation{
	//int totalseats;
	int ub,mb,lb;
	static int bub,bmb,blb;
	ReserveTrain(int lb,int mb,int ub){
		this.mb=mb;
		this.lb=lb;
		this.ub=ub;
	}
	boolean reserve(int seats,String type){
		if(type.equals("upper")){
			if(seats>ub) return false;
			else return true;
		}
		else if(type.equals("lower")){
			if(seats>lb) return false;
			else return true;
		}
		else{
			if(seats>mb) return false;
			else return false;
		}
	}
	int getAvailable(){
		return lb;
	}

}
class ReserveBus extends Reservation{
	int totalseats;
	static int booked=0;
	ReserveBus(int ts){
		totalseats=ts;
	}
	boolean reserve(int seats,String type){
		int avail=getAvailable();
		if(seats>avail){
			return false;
		}
		booked+=seats;
		return true;
	}
	int getAvailable(){
		return totalseats-booked;
	}
}
class Holidays{
	public static void main(String args[]){
		ReserveBus r1=new ReserveBus(50);
		System.out.println("can i reserve 52 seats?"+r1.reserve(52,"normal"));
		System.out.println("can i reserve 20 seats?"+r1.reserve(20,"normal"));
		System.out.println("can i reserve 35 more seats?"+r1.reserve(35,"normal"));
		System.out.println("---------------------------------------");
		ReserveTrain r2=new ReserveTrain(20,20,20);
		System.out.println("can i book 25 lower berths? "+r2.reserve(25,"lower"));
		System.out.println("can i book 15 middle berths? "+r2.reserve(15,"middle"));
		
		
	}
}
