package sk.resy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.function.Function;

@SpringBootApplication
public class ResyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResyApplication.class, args);
    }

    // comment


    // lambda expressions


    ArrayList<Integer> numbers = new ArrayList<Integer>();


    public void run() {

        var c = 10;

        var x = urobNiecoA(10, a -> a * c); // 100
        var y = urobNiecoA(10, a -> a - 5 ); // 5
        var z = urobNiecoA(10, a -> a % 2 ); // 5
        var b = urobNiecoA(10, new Nasobitel());


        numbers.forEach(a -> System.out.println(a));
        numbers.forEach(System.out::println);

        for (Integer a : numbers) {
            System.out.println(a);
        }

        List<Integer> res = numbers // 1, 5, 2
                .stream()
                .map(a -> a * 11) // vsetky sa vynasobia 10-tkou -> 11, 66, 22
                .filter(a -> a % 2 == 0) // lambda - anonymna funkcia?
              .filter(ResyApplication::filterEven) // method handle
                .toList();

        List<Integer> res2 = new ArrayList<>();
        for (Integer n : numbers) {
            var temp = n * 11;
            if (temp % 2 == 0) res2.add(temp);
        }


    }

    public static boolean filterEven(int x ) {
        return x % 2 == 0;
    }



    public Integer urobNiecoB(int x) {
        return x * 10;
    }

    public Integer urobNiecoA(int x, Function<Integer, Integer> f) {
        return f.apply(x);
    }

    private class Nasobitel implements Function<Integer, Integer> {
        @Override public Integer apply(Integer integer ) { return integer * 10;}
    }

}


// @FunctionalInterface
// public interface Foo {
//     String method();
// }
