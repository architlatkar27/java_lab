public class LambdaThread{
    public static void main(String args[]){
        Runnable r1=new Runnable(){
            public void run(){
                System.out.println("thread without lambda");
            }
        };
        Thread t1=new Thread(r1);
        t1.start();
        Runnable r2=()->{
            System.out.println("thread using lambda expression");
        };
        t1=new Thread(r2);
        t1.start();
        Thread t2=new Thread(r2);
        t2.start();
    }
}