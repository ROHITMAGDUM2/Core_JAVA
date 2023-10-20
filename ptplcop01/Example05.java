package ptplcop01;
import java.util.function.Consumer;
 
public class Example05 {
    public static void main(String[] args) {
        Consumer<Integer> consumer = System.out::print;
        Integer i = 5;
        consumer.andThen(consumer).accept(i++); //Line 7
    }
} 