/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1;
@FunctionalInterface
interface hihhuu { int lasku(int x, int y, int fahrenheit); }
public class Todo11 {
    
    public Fahrenheit Todo11(Fahrenheit fahrenheit) {
    		
	        // lambda lauseke joka määrittää lasku method 
    	hihhuu toCelsius = (int fahrenheit)->(5/9)*(fahrenheit-32); 
	        
	        // parametrin palautustyypin on sama kuin prototyypissä !! Muista!
	        System.out.println(toCelsius);
	        return toCelsius;
	        
	        hihhuuz	area = (double radius) -> (Math.PI * radius * radius);
	        double rad = 6;
	        double ans2 = area.lasku2(rad);
	        return area;
    }
    int a = 5; int b = 9; int c = 35;
    double kek() {
    	System.out.println(Fahreinheit);
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


