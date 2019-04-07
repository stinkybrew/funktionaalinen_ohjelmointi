/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1;

public class Todo11 {
	
	int a = 5; int b = 9; int c = 35;
    public double Todo11(String[] args) {
    		
	        // lambda lauseke joka määrittää lasku method 
    	int toCelsius = (int fahrenheit)->(5/9)*(fahrenheit-32); 
	        int temperature = ((temperature - 32)*5)/9;
	        // parametrin palautustyypin on sama kuin prototyypissä !! Muista!
	        System.out.println(toCelsius);
	        return toCelsius;
	        
	        double	area = (double radius) -> (Math.PI * radius * radius);
	        double rad = 6;
	        double ans2 = area.lasku2(rad);
	        return area;
    }
    
    double kek() {
    	System.out.println(Todo11);
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


