package streams;

import java.util.*;
import java.util.function.IntSupplier;
import java.util.stream.*;
import java.nio.charset.Charset;
import java.nio.file.*;

public class BuildingStreams {

    public static void main(String...args) throws Exception{
        
        // Stream.of
        Stream<String> stream = Stream.of("Java 8", "Lambdas", "In", "Action");
        stream.map(s -> s.toUpperCase()).forEach(i -> System.out.println(i));

        // Stream.empty
        Stream<String> emptyStream = Stream.empty();

        // Arrays.stream
        int[] numbers = {2, 3, 5, 7, 11, 13};
        System.out.println(Arrays.stream(numbers).sum());

        // Stream.iterate
        Stream.iterate(0, n -> n + 2)
              .limit(10)
              .forEach(i -> System.out.println(i));

        // fibonnaci with iterate
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1],t[0] + t[1]})
              .limit(10)
              .forEach(t -> System.out.println("(" + t[0] + ", " + t[1] + ")"));
        
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1],t[0] + t[1]})
              .limit(10)
              . map(t -> t[0])  
              .forEach(i -> System.out.println(i));

        // random stream of doubles with Stream.generate
        Stream.generate(() -> Math.random())
              .limit(10)
              .forEach(i -> System.out.println(i));
 
        // stream of 1s with Stream.generate
        IntStream.generate(() -> 1)
                 .limit(5)
                 .forEach(i -> System.out.println(i));

        IntStream.generate(new IntSupplier(){
            public int getAsInt(){
                return 2;
            }
        }).limit(5)
          .forEach(i -> System.out.println(i));
   

        IntSupplier fib = new IntSupplier(){
                  private int previous = 0;
                  private int current = 1;
                  public int getAsInt(){
                      int nextValue = this.previous + this.current;
                      this.previous = this.current;
                      this.current = nextValue;
                      return this.previous;
                  }
              };
         IntStream.generate(fib).limit(10).forEach(i -> System.out.println());

         long uniqueWords = Files.lines(Paths.get("data.txt"), Charset.defaultCharset())
                                 .flatMap(line -> Arrays.stream(line.split(" ")))
                                 .distinct()
                                 .count();

         System.out.println("There are " + uniqueWords + " unique words in data.txt");


    }
}
