package finalproject;

import java.lang.Integer;


public class Calculation {
	
	

	public double integrand(String c1, String c2, String c3, String e1, String e2, String e3, String d1, String d2, String d3, String upperRange, String lowerRange)
	{
		
		
		int a = Integer.valueOf(c1); //c
		int d = Integer.valueOf(e1).intValue(); //e
		int i = Integer.valueOf(d1).intValue(); //d
		
		int b = Integer.valueOf(c2).intValue(); //c
		int e = Integer.valueOf(e2).intValue(); //e
		int j = Integer.valueOf(d2).intValue(); //d
		
		int c = Integer.valueOf(c3).intValue(); //c
		int f = Integer.valueOf(e3).intValue(); //e
		int k = Integer.valueOf(d3).intValue(); //d
		
		int g = Integer.valueOf(upperRange).intValue(); //u
		int h = Integer.valueOf(lowerRange).intValue(); //l
		
		
		
		
		
		double y = ((a*((g^(d+1)))/(i*(d+1))))  +  ((b*((g^(e+1)))/(j*(e+1))))  +  ((c*((g^(f+1)))/(k*(f+1))));
		double t = ((a*((h^(d+1)))/(i*(d+1))))  +  ((b*((h^(e+1)))/(j*(e+1))))  +  ((c*((h^(f+1)))/(k*(f+1))));
		
		double u = y - t;
		
		return u;
	}
	
}
