package AdvMath;
import java.lang.Math;
public class Sum{
	public void sum(double x){
		double r=Math.toRadians(x);
		double res=Math.sin(r)+Math.cos(r)+Math.tan(r);
		System.out.println("result of trigo expression : "+res);
	}
}
