/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1;

@FunctionalInterface
interface hihhuu { int lasku(int fahrenheit); }

public class Todo1 {
    
    public int converter(int fahrenheit) {
    		
	        // lambda lauseke joka määrittää lasku method 
	    	hihhuu toCelsius = (int fahrenheitz)->(5/9)*(fahrenheit-32); 
	        
	        // parametrin palautustyypin on sama kuin prototyypissä !! Muista!
	    	int ans = toCelsius.lasku(fahrenheit); 
	        System.out.println(ans);
	        return ans;
    }
    
    public double rads(double radius) {
        hihhuuz	area = (double radiuz) -> (Math.PI * radius * radius);
        
        double ans2 = area.lasku2(radius);
        System.out.println(ans2);
        return ans2;
    }
    
    double kek() {
    	int fahrenheit = 35;
    	double rad = 6;
    	System.out.println("test print of fahrenheit to celsius: " + converter(fahrenheit));
    	System.out.println("test print of radius calculations: " + rads(rad));
    	return fahrenheit + rad;
    }
 
    /*
    double Ans;
    public Ans Todo1(Ans ans) {
        // lambda lauseke joka määrittää lasku method 
    	hihhuu toCelsius = (int x, int y, int fahrenheit)->(x/y)*(fahrenheit-32); 
        
        int a = 5; int b = 9; int c = 35;
        
        // parametrin palautustyypin on sama kuin prototyypissä !! Muista!
        int ans = toCelsius.lasku(a,b,c); 
        System.out.println(ans);
        return ans;
        
        hihhuuz	area = (double radius) -> (Math.PI * radius * radius);
        double rad = 6;
        double ans2 = area.lasku2(rad);
        System.out.println(ans2); 
    }
    public Ans gtg(Ans ans) {
    	System.out.println(ans);
    } */
    
}


