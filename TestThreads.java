class TestingThreads extends Thread{
	public static void main(String args[]){
		Thread t1=new Thread();
		Thread t2=new Thread();
		Thread t3=new Thread();
		Thread t4=new Thread();
		Thread t5=new Thread();
		t1.setPriority(7);
		t2.setPriority(10);
		t3.setPriority(1);
//		t4.setPriority(5);
//		t5.setPriority(3);
		t1.start();
		if(t1.isAlive()) System.out.println("Thread 1 is alive");
		else System.out.println("Thread 2 is dead");
		t2.start();
		try{
			t2.sleep(1000);
		}
		catch(Exception e){
			System.out.println("sleep disturbed");
		}
		if(t2.isAlive()) System.out.println("Thread 2 is alive");
		else System.out.println("Thread 2 is dead");
		t3.start();
		if(t3.isAlive()) System.out.println("Thread 3 is alive");
		else System.out.println("Thread 3 is dead");
	}
}
