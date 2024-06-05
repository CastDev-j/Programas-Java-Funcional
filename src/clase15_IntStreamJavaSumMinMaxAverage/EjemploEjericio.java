package clase15_IntStreamJavaSumMinMaxAverage;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class EjemploEjericio {
    
        public static void main(String[] args) {

        int[] arrIntegers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] noRepeatInt = Arrays.stream(arrIntegers)
                .distinct()
                .sorted()
                .filter(EjemploEjericio::isEven)
                .toArray();

        System.out.println("No repeat and sorted even numbers: ");
        System.out.println(Arrays.toString(noRepeatInt));
        

        OptionalInt min = Arrays.stream(arrIntegers)
                .min();

        System.out.println();
        System.out.println("Min: " + min.orElseThrow());

        OptionalInt max = Arrays.stream(arrIntegers)
                .max();

        System.out.println();
        System.out.println("Max: " + max.orElseThrow());
        
        int sum = Arrays.stream(arrIntegers)
                .sum();

        System.out.println();
        System.out.println("Sum: " + sum);

        OptionalDouble average = Arrays.stream(arrIntegers)
                .average();

        System.out.println();
        System.out.println("Average: " + average.orElseThrow());


        Stream<Integer> stream = Arrays.stream(arrIntegers).boxed();

        System.out.println();
        System.out.println("Stream: "+ stream.toList());

        int quantityOfEvenNumbers = Arrays.stream(noRepeatInt)
                .toArray()
                .length;

        System.out.println();
        System.out.println("Quantity of even numbers: " + quantityOfEvenNumbers);


    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

}
