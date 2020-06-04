import java.util.*;
public class BufferStrings{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        StringBuffer s1=new StringBuffer(sc.nextLine());
        String s2=new String("abcdef");
        /*try{
            s2.append("pqr");
        }
        catch(Exception e){
            System.out.println("strings are immutable");
        }*/
        s1.insert(4, "this is garbage");
        System.out.println("new s1--"+s1);
        s1.delete(4,4+15);
        System.out.println("2nd modification---"+s1);
        s1.replace(4,10,"cicada");
        String s3=new String(s1.substring(2,8));
        System.out.println("printing substring of s1--"+s3);
        s1=s1.reverse();
        System.out.println("s1 was reverse--"+s1+"  it has capacity--"+s1.capacity());

    }
}