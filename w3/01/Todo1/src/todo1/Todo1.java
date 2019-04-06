/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1;

import java.util.Arrays;
import java.util.List;
public class Todo1 {
    
    public static void main(String[] args) {
        List<String> values = Arrays.asList("1", "2", "3");
        final int sum = values.stream()
            .map(item -> Integer.parseInt(item))
            .reduce(0, (a,b) -> a + b);
        System.out.println("Sum = " + sum);
    }
}
