package GOF.Lab1.AdvancedConcepts;

import java.util.Arrays;
import java.util.List;

public class Stream {



    public void streamExp() {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        long count = names.stream()
                .filter(name -> name.length() > 3)
                .map(String::toUpperCase)
                .count();

        System.out.println("Count: " + count);
    }
}
