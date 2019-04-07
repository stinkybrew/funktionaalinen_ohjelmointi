package todo1;

public class Converter {
    public int converter(int fahrenheit) {	
        // lambda lauseke joka maarittiaa lasku method 
    	hihhuu toCelsius = (int fahrenheitz)->(5/9)*(fahrenheit-32); 
        
        // parametrin palautustyypin on sama kuin prototyypiss� !! Muista!
    	int ans = toCelsius.lasku(fahrenheit); 
        System.out.println("Printed inside CONVERTER method: " + ans);
        return ans;
    } 
}
