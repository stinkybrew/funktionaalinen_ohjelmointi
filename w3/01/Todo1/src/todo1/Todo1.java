/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1;

import java.util.Arrays;
import java.util.List;
public class Todo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<String> values = Arrays.asList("1", "2", "3");
        int sum = 0;
        for(String item: values) {
        sum += Integer.parseInt(item);
        }
        System.out.println("Sum = " + sum);
        
    }
    
}
