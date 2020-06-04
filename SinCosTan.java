class Sine extends Thread{
	double angle;
	double res;
	Sine(double angle){
		this.angle=Math.toRadians(angle);
	}
	public void run(){
		res=Math.sin(angle);
	}
}
class Cosine extends Thread{
	double angle;
	double res;
	Cosine(double angle){
		this.angle=Math.toRadians(angle);
	}
	public void run(){
		res=Math.cos(angle);
	}
}
class Tan extends Thread{
	double angle;
	double res;
	Tan(double angle){
		this.angle=Math.toRadians(angle);
	}
	public void run(){
		res=Math.tan(angle);
	}
}
class SinCosTan{
	public static void main(String args[]){
		double y;
		Sine s=new Sine(45);
		Cosine c=new Cosine(45);
		Tan t=new Tan(45);
		s.start();t.start();c.start();
		try{
			s.join();t.join();c.join();
		}
		catch(Exception e){
			System.out.println("interrupted");
		}
		y=s.res+t.res+c.res;
		System.out.println("sin+cos+tan "+y);
	}
}
