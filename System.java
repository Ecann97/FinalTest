import javax.swing.JLabel;
import javax.swing.JTextField;

public class System {
	
	

	public double integrand(String c1, String c2, String c3, String e1, String e2, String e3, String d1, String d2, String d3, String upperRange, String lowerRange)
	{
		int a = Integer.getInteger(c1).intValue(); //c
		int d = Integer.getInteger(e1).intValue(); //e
		int i = Integer.getInteger(d1).intValue(); //d
		
		int b = Integer.getInteger(c2).intValue(); //c
		int e = Integer.getInteger(e2).intValue(); //e
		int j = Integer.getInteger(d2).intValue(); //d
		
		int c = Integer.getInteger(c3).intValue(); //c
		int f = Integer.getInteger(e3).intValue(); //e
		int k = Integer.getInteger(d3).intValue(); //d
		
		int g = Integer.getInteger(upperRange).intValue(); //u
		int h = Integer.getInteger(lowerRange).intValue(); //l
		
		
		
		
		
		double y = ((a*(g^(d+1)))/(i*(d+1)))  +  ((b*(g^(e+1)))/(j*(e+1)))  + ((c*(g^(f+1)))/(k*(f+1)));
		double t = ((a*(h^(d+1)))/(i*(d+1))) +   ((b*(h^(e+1)))/(j*(e+1)))  + ((c*(h^(f+1)))/(k*(f+1)));
		
		double u = y - t;
		
		return u;
	}
	
}
