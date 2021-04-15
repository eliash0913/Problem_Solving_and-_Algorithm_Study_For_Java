package Basics;

import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args){
        String[] a = {"a","b","c"};
        String[] b = {"d","e","f"};
        int[] c = {1,2,3,4};
        Stream<String> stream1 = Stream.of(a);
        Stream<String> stream2 = Stream.of(b);
        stream1.forEach(System.out::println);
        stream2.forEach(System.out::println);
        Stream<Integer> stream3 = Stream.iterate(0,i->i+2).limit(10);
        stream3.forEach((System.out::println));
    }
}
