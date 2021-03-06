package todo2;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
import java.util.*;

import streams.*;
import menu.Dish;
import menu.Dish.Type;

import java.util.stream.Collectors;
// Teht�v�nanto
/* Etsi kaikki rahansiirrot (transaction), 
jotka ovat tehty vuoden 2012 j�lkeen ja joiden arvo on v�hint��n 900. */
import java.util.stream.Stream;



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
        Laske eri ruokalajien m��r� (Dish.java-tiedostossa on lueteltu ruokalajeja) 
        k�ytt�en map- ja reduce-operaatioita. */      
        
        // WAY TO MAKE VOID TO PUBLIC: List<DishPublic> result = convertToStaffPublic(Dish);
        
          
        //List<Dish> k = dishes.menu();
       // int y;
        
  
        
        
        List<Dish> menu = Dish.menu;
        Set<Type> allTypes = new HashSet<>();
        
        List<Type> name = menu.stream()
        		
        		.map(i -> i.getType())
        		.filter(n -> !allTypes.add(n)) //Set.add() returns false if the item was already in the set.
        		
        		.collect(Collectors.toList());
        		
        		System.out.println("Number of types:" +
        		name + allTypes);
        
        		
        /*	
        		List<Employee> employees = new ArrayList<>();
                employees.add(new Employee(1,"John","street 1,"));
                employees.add(new Employee(2,"Frank","Nr. Cosmos,"));
                employees.add(new Employee(3,"Danyy","street 101,Washington DC,"));
                employees.add(new Employee(1,"John","street 1,"));
                employees.add(new Employee(2,"Frank","Nr. Cosmos,"));
                employees.stream().collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()))
                        .entrySet().stream()
                        .filter(e -> e.getValue() > 1L)
                        .map(e -> e.getKey())
                        .collect(Collectors.toList())
                        .forEach(employee -> System.out.println(employee.getEmpId()+"==>"+employee.getEmpName()));		
        */
        		
        /*
        Type counter = null;
        List<Dish> dishes = Dish.menu; 
        List<Integer> collect1 = dishes.stream()
        		.map(x -> (x.length()))
        		.reduce(0,(a, b) -> a + b);
        System.out.println(counter);
        System.out.println(dishes);
        System.out.println(collect1);
        */
        //collect1.ifPresent(System.out::println); 
        
      /*  int result = users.stream()
        		  .reduce(0, (partialAgeResult, user) -> partialAgeResult + user.getAge(), Integer::sum);
        		assertThat(result).isEqualTo(65);
	*/
	}
}
