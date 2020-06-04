import java.util.Scanner;
public class Double_Lariat{
	public static void main(String args[]){
		String s;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter string");
		s=obj.next();
		int count=0;
		StringBuffer s1=new StringBuffer(s.toUpperCase());
		for(int i=0;i<s.length()-1;i++){
			if(s1.charAt(i)==s1.charAt(i+1)){
				count++;
			}
		}
		System.out.println("number of double lariats "+count);
	}
}

