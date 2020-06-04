import java.util.Scanner;
public class Vowels{
	public static void main(String args[]){
	String str;
	System.out.println("enter string");
	Scanner obj=new Scanner(System.in);
	str=obj.next();
	StringBuffer str1=new StringBuffer(str.toLowerCase());
	char c,c1; 
	for(int i=0;i<str.length();i++){
		c=str1.charAt(i);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
			int x=c;
			x+=1;
			str1.setCharAt(i,(char)x);
		}
	}
	System.out.println("output string "+str1);
	}
}
