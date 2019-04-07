/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1;

@FunctionalInterface
interface hihhuu { int lasku(int fahrenheit); } // TESTING "FunctionalInterface" here

public class Todo1 {
    
    public void main(int fahrenheit) {
    	public int converter(int fahrenheit) {	
	        // lambda lauseke joka m��ritt�� lasku method 
	    	hihhuu toCelsius = (int fahrenheitz)->(5/9)*(fahrenheit-32); 
	        
	        // parametrin palautustyypin on sama kuin prototyypiss� !! Muista!
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
}