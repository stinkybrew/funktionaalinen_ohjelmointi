
package todo1;

import CallableMethods.*;

public class Todo1 {
    
    public static void main(String[] args) {

        Rads raz = new Rads();
        double val = raz.rads();  			// Kutsutaan metodit
        
        Converter conv = new Converter();	// Kutsutaan metodit
        int value = conv.converter(value);
        
        // calls: hihhuu toCelsius = (int fahrenheitz)->(5/9)*(fahrenheit-32); 
        System.out.println("test print of fahrenheit to celsius: " + value);
        
        // calls: hihhuuz area = (double radiuz) -> (Math.PI * radius * radius);
        System.out.println("test print of radius calculations: " + raz);
           
    }
    int fahrenheit = 45;
    double rad = 23;
}