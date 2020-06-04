interface Tester{
    int test(int n1,int n2) throws Exception;
}
public class LambdaException{
    public static void main(String args[]){
        Tester t1=(n1,n2)->{
            if(n2==0)
                throw new Exception();
            else return n1/n2; 
        };
        try{
            System.out.println("check result 10 2  "+t1.test(10,2));
            System.out.println("check result 10 0  "+t1.test(10,0));
        } 
        catch(Exception e){
            System.out.println("divide by zero error");
        }
    }
}