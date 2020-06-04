class Odds extends Thread{
	int i=1;
	public void run(){
		
			try{
				if(i==7) Thread.interrupt();
				System.out.println("odd number thread "+i);
				i+=2;
				Thread.sleep(1000);
			}
			catch(Exception e){
				System.out.println("thread was interrupted");
			}
		
	}
}
class Reverse extends Thread{
	int n;int reverse;
	Reverse(int n){ this.n=n; }
	public void run(){
		reverse=0;
		while(n>0){
			reverse=10*reverse+n%10;
			n/=10;
		}
		System.out.println("reverse: "+reverse);
	}
}
class WeirdThreads{
	public static void main(String args[]){
		Odds o=new Odds();
		Reverse r=new Reverse(1234);
		o.start();r.start();
		Reverse r1=new Reverse(r.reverse);
		r1.start();

	}
}
