package Stacktrace;

import java.util.ArrayList;
import java.util.List;

public class Statistics {
    private List<Integer> numbers;

    public Statistics() {//Initializing Statistics List
        this.numbers = new ArrayList<>();
    }

    public void add(int number) {
        this.numbers.add(number);
    }

    public double average() {
        return this.numbers.stream().mapToInt(i -> i).average().orElse(0.0);//swapped out .getAsDouble
    }
}
/*This code did not work at first because the 'List<Integer> numbers' was not initialized
* which threw the 'NullPointerExceptions' since it tried calling the 'add' method.*/
/* Then the code threw 'NoSuchElementException' because the new statistics list was empty,
 so I replaced '.getAsDouble()' with a default value using 'orElse()', now it works!*/