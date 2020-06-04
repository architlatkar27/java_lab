import java.util.*;
class NormalStrings{
    public static void main(String args[]){
        System.out.println("enter a string");
        Scanner sc=new Scanner(System.in);
        String s=new String(sc.nextLine());
        byte seq[]={65,66,67,68,69};
        String s1=new String(seq);
        System.out.println("2 STRINGS created successfully");
        System.out.println("length of s "+s.length()+"// length of s1 "+s1.length());
        System.out.println("char at 2 in s is :"+s.charAt(2));
        char buf[]=new char[5];
        s.getChars(4, 8, buf, 0);
        try{
            System.out.println("getchars from 4 to 8 from s : "+buf);
        }
        catch(Exception e){
            System.out.println("check your try1");
        }
        System.out.println("are s and s1 same ?"+s1.equals(s));
        System.out.println("are s and s1 same ignoring case"+s1.equalsIgnoreCase(s));
        System.out.println("does s start with abc?  "+s.startsWith("abc"));
        System.out.println("does s end with xyz?  "+s.endsWith("xyz"));
        System.out.println("does s start with pqr from index 3?  "+s.startsWith("pqr", 3));
        System.out.println("rank of s wrt cicada - "+s.compareTo("cicada"));
        System.out.println("what is the index of fox? "+s.indexOf("fox"));
        System.out.println("last occurrance of o is at"+s.lastIndexOf("o"));
        System.out.println("whats the substring from 5 to 10?  "+s.substring(5, 10));
        System.out.println("adding kakashi at the end  "+s.concat("kakashi"));
        System.out.println("replace all z with 1"+s.replace('z', '1'));

    }
}