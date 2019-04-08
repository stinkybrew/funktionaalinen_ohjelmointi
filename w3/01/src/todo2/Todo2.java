package todo2;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
import java.util.*;
import java.util.stream.Stream;

import streams.*;
import menu.Dish;
import menu.Dish.Type;
import menu.*;

// Teht‰v‰nanto
/* Etsi kaikki rahansiirrot (transaction), 
jotka ovat tehty vuoden 2012 j‰lkeen ja joiden arvo on v‰hint‰‰n 900. */



public class Todo2 {
	
	public static void main(String[] args) {
		
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );
		
        List<Transaction> tr2012 = transactions.stream()
                          .filter(transaction -> transaction.getYear() > 2011)
                          .filter(transaction -> transaction.getValue() > 900)
                          .sorted(comparing(t -> t.getValue()))
                          .collect(toList());
        System.out.println(tr2012);
        
     
        /*
        Laske eri ruokalajien m‰‰r‰ (Dish.java-tiedostossa on lueteltu ruokalajeja) 
        k‰ytt‰en map- ja reduce-operaatioita. */      
        
      // Dish stringList = new Dish();
      // Dish l = stringList.menu;
           
        List<Dish> k = Dish.menu; 
        Optional<String> gg = k.stream()
        		.map(item -> (item.getName()))
        		.reduce((a,b) -> a );
        System.out.println(gg);
        
     //  Stream<Dish> k = menu.stream
        //		.map(item -> (item.getName()))
        	//	.reduce((a,b) -> a.length );
        		
        	//	System.out.println(k);
       
       // int k = dishes.stream()
        //	 .map(dishes -> (dishes))
	}

}
