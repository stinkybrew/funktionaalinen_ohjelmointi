
package todo1;

import CallableMethods.*;

@FunctionalInterface
interface hihhuu { int lasku(int fahrenheit); } // TESTING "FunctionalInterface" here

public class Todo1 {
    
    public static void main(String[] args) {
    	//int fahrenheit = 45;
        //double rad = 23;
        Rads raz = new Rads();
        Converter conv = new Converter();
        System.out.println("test print of fahrenheit to celsius: " + conv);
        System.out.println("test print of radius calculations: " + raz);
           
    }        
}