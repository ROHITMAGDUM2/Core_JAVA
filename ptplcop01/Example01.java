package ptplcop01;

import java.util.stream.IntStream;
public class Example01 {
	// this is example 01
	    public static void main(String[] args) {
	    	
	    	// here i use map method to calculate range of sum
	        int sum = IntStream.rangeClosed(1,3).map(i -> i * i)
	                .map(i -> i * i).sum();
	        System.out.println(sum);
	    }
	}
