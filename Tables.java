class A{
	void display(int a){
		try{
			for(int i=1;i<=10;i++){
				System.out.println(a+"*"+i+"="+(a*i));
				Thread.sleep(500);
			}
		}
		catch(Exception e){
			System.out.println("thread was interupted");
		}
		finally{
			System.out.println("table ends");
		}
	}
}
class Table_Thread extends Thread{
	A a;
	int n;
	Table_Thread(A a,int n){
		this.a=a;this.n=n;
	}
	
		public void run(){
			synchronized(a){
		a.display(n);
		}
	}
}
class Tables{
	public static void main(String args[]){
		A a=new A();
		Table_Thread t1=new Table_Thread(a,8);
		Table_Thread t2=new Table_Thread(a,9);
		t1.start();t2.start();

	}
}
