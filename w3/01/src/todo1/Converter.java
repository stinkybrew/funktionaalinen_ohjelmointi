package todo1;

@FunctionalInterface
interface interface1 { int lasku(int fahrenheit); } // TESTING "FunctionalInterface" here

public class Converter {
    public int converter(int fahrenheit) {
    	
        // lambda lauseke joka maarittiaa lasku method 
    	interface1 toCelsius = (int f) -> (5/9)*(fahrenheit-32); 
        
        // parametrin palautustyypin on sama kuin prototyypiss� !! Muista!
    	int ans = toCelsius.lasku(fahrenheit); 
        System.out.println("Printed inside CONVERTER method: " + ans);
        return ans;
      
    } 
    int fahrenheit = 45;
    
}
