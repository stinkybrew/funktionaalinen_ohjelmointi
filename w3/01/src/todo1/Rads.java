package todo1;

public class Rads {
    public double rads(double radius) {
    	interface2 area = (double r) -> (Math.PI * radius * radius);

        double ans2 = area.lasku2(radius);
        System.out.println("Printed inside RADS method: " + ans2);
        return ans2;
    }
    
}
