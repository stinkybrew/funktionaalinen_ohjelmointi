/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface hihhuu { int lasku(int x, int y, int fahrenheit); }

public class Todo1 {
    
    public void main(String[] args) {
    	
        // lambda lauseke joka määrittää lasku method 
    	hihhuu toCelsius = (int x, int y, int fahrenheit)->(x/y)*(fahrenheit-32); 
        
        int a = 5; int b = 9; int c = 35;
        // parametrin palautustyypin on sama kuin prototyypissä !! Muista!
        int ans = toCelsius.lasku(a,b,c); 
        System.out.println(ans);
        //return ans;
        
        hihhuuz	area = (double radius) -> (Math.PI * radius * radius);
        double rad = 6;
        double ans2 = area.lasku2(rad);
        System.out.println(ans2); 
    }
    
}


/*
toCelsius -> {return (5/9) * (fahrenheit-32)}
area -> {return Math.PI * radius * radius}


function toCelsius(fahrenheit) {
    return (5/9) * (fahrenheit-32);
}
function area(radius)   
    {  
        return Math.PI * radius * radius;  
    };  

*/
