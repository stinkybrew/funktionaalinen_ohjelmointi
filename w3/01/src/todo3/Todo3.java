package todo3;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import menu.Dish.Type;
import streams.Transaction;
import todo1.Rads;

public class Todo3 {

	public static void main(String[] args) {
		/* Tee vuo, jossa generoit 20 satunnaislukua, muutat ne nopan silmäluvuiksi sopiviksi välille 1-6,
		   ja lasket kuinka monta kutosta saadaan.  */
		 Integer rand= ((int) (Math.random()* 6)+1);
		
	/*	 List<Rads> randomint = Arrays.asList(
		            new Rads((int) (Math.random()* 6)+1)), 
		            new Rads(rand),
		            new Rads(rand),
		            new Rads(rand),	
		            new Rads(rand),
		            new Rads(rand)
		 );		 //EI TOIMI LISTA TYYLI
		 
		 List<Random> randz = randomint.stream()
		 .map(i -> (randz))
		 .filter(i -> randz==6)
		 //.reduce((a,i) -> a + i);
		 .forEach(System.out::println);  */
		 
		 
		 
		IntStream.rangeClosed(1, 20)
        .map(i -> (rand))
        .filter(i -> i==6)
		//.reduce((a,i) -> a + i)
		.sum();
		
		int randomint = randint();
		System.out.println("Random Number:" + randomint); 
				     
	}
	
	public static final int randint() {
		IntStream.rangeClosed(1, 20)
        .map(i -> ((int) (Math.random() * 6)+1))
        .filter(i -> i==6)
		//.sum();
        .forEach(System.out::println);
		return randint();
	}

}