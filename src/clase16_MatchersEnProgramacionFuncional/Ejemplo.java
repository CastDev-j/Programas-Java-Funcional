package clase16_MatchersEnProgramacionFuncional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Stream;

public class Ejemplo {
    

    public static void main(String[] args) {

    // Matchers en java functional

    Integer[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

    // allmatch

    boolean resultadoAll = Arrays.stream(arr)
        .allMatch(n -> n % 2 == 0);

    System.out.println("resultado = " + resultadoAll);

    // anyMatch

    boolean resultadoAny = Arrays.stream(arr)
        .anyMatch(n -> n % 2 == 0);

    System.out.println("resultado = " + resultadoAny);

    // noneMatch


        boolean resultadoNone = Arrays.stream(arr)
                .noneMatch(Ejemplo::isOdd);

        System.out.println("resultado = " + resultadoNone);


        int longitud = 10;
        int[] arrayRandomNumbers = Stream.iterate(new Random().nextInt(100), n -> new Random().nextInt(100))
                .limit(longitud)
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println("arrayRandomNumbers = " + Arrays.toString(arrayRandomNumbers));

        int[] arrayRandomNumbersSortedMinMax = Arrays.stream(arrayRandomNumbers)
                .sorted()
                .toArray();

        System.out.println("arrayRandomNumbersSortedMinToMax = " + Arrays.toString(arrayRandomNumbersSortedMinMax));

        int[] arrayRandomNumbersSortedMaxMin = Arrays.stream(arrayRandomNumbers)
                .boxed()
                //.sorted((o1, o2) -> o2 - o1)
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println("arrayRandomNumbersSortedMaxToMin = " + Arrays.toString(arrayRandomNumbersSortedMaxMin));
        


    }

    public static boolean isOdd(int n){
        return n % 2 != 0;
    }

}
