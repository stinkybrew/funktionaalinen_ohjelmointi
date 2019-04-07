package todo1;

@FunctionalInterface
interface interface1 { float lasku(float fahrenheit); } // TESTING "FunctionalInterface" here

public class Converter {
    public float converter(float fahrenheit) {
    	
        // lambda lauseke joka maarittiaa lasku method 
    	interface1 toCelsius = (float f) -> (5/9)*(fahrenheit-32); 
        
        // parametrin palautustyypin on sama kuin prototyypiss� !! Muista!
    	float ans = toCelsius.lasku(fahrenheit); 
        System.out.println("Printed inside CONVERTER method: " + ans);
        return ans;
      
    } 
    
    
}
