interface Calculate{
	int res(int a,int b);
}

public class Lambdademo{
	public static void main(String args[]){
		System.out.println("numbers are 2,3");
		
		Calculate o1;
		o1=( a, b) -> (a*b);
		//o1=(int a,int b) -> (a+b);
		System.out.println("multiply - "+o1.res(2,3));
		
		Calculate o2;
		o2=(int a,int b)-> (a+b);
		System.out.println("addition - "+o2.res(2,3));
		System.out.println(o1.res(9,0));		
	}
}
