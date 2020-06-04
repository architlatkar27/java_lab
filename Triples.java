package AdvMath;
public class Triples{
	public void display(int limit){
		int a,b,c=0;
		int m=2;
		while(m<=limit){
			for(int n=1;n<m;n++){
				a=m*m-n*n;
				b=2*m*n;
				c=m*m+n*n;
				if(c>limit) break;
				System.out.println("triplets : "+a+" "+b+" "+c);
			}
			m++;
		}
	}
}
