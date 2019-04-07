
package todo1;

//import CallableMethods.*;

public class Todo1 {
    
    public static void main(String[] args) {
    	int fahrenheit = 45;
    	double radius = 23;
    	
        Rads raz = new Rads();
        double valrad = raz.rads(radius);  			// Kutsutaan metodit
        
        Converter conv = new Converter();	// Kutsutaan metodit
        int valconv = conv.converter(fahrenheit);
        
        // calls: hihhuu toCelsius = (int fahrenheitz)->(5/9)*(fahrenheit-32); 
        System.out.println("test print of fahrenheit to celsius: " + valconv);
        
        // calls: hihhuuz area = (double radiuz) -> (Math.PI * radius * radius);
        System.out.println("test print of radius calculations: " + valrad);
           
    }
    
}