import java.util.Scanner;
class ValidateTriangle extends Exception{
	String s;
	ValidateTriangle(String s){ this.s=s; }
	public String toString(){
		return "triangle has invalid sides";
	}
}
public class Triangles{
	public static void main(String args[]){
		int a,b,c;
		
		Scanner obj=new Scanner(System.in);
		System.out.println("enter sides of triangle");
		a=obj.nextInt();
		b=obj.nextInt();
		c=obj.nextInt();

		try{
			if((a+b)<=c || (a+c)<=b || (b+c)<=a) throw new ValidateTriangle("triangle sides are invalid");
		//	System.exit(0);
		}
		catch(ValidateTriangle e){
			System.out.println(e.s);System.exit(0);
		}
		
		System.out.println("area of triangle : "+area(a,b,c));


	}
	static double area(int s1,int s2,int s3){
		double s=((double)s1+s2+s3)/2;
		double a=s*(s-s1)*(s-s2)*(s-s3);
		a=Math.sqrt(a);
		return a;
	}
}

