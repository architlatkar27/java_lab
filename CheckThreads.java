class MyThread implements Runnable{
    String str;
    MyThread(String str){
        this.str=str;
    }
    public void run(){
        System.out.println("thread is alive and kicking");
    }
    public String toString(){
        return msg;
    }
}
public class CheckThreads{
    public static void main(String args[]){
        MyThread r=new MyThread("hello thread");
        Thread t=new Thread(r);
        t.start();
    }
}