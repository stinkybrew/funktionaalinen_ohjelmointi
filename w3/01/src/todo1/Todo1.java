
package todo1;

import CallableMethods.*;

public class Todo1 {
    
    public static void main(String[] args) {
    	float fahrenheit = 35;
    	double radius = 23;
    	
        Rads raz = new Rads();
        double valrad = raz.rads(radius);   // Kutsutaan metodit
        
        Converter conv = new Converter();	// Kutsutaan metodit
        float valconv = conv.converter(fahrenheit);
        
        // kutsuu metodia Converter.java tiedostosta
        System.out.println("test print of fahrenheit to celsius: " + valconv);
        
        // kutsuu metodia Rads.java tiedostosta
        System.out.println("test print of radius calculations: " + valrad);
           
    }
    
}