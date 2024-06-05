package clase14_AplanarArreglosParaSuReduccion;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ejercicio {
        public static void main(String[] args) {

        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // Suma, int[]

        int[] arrFlat = Stream.of(arr)
                .flatMapToInt(Arrays::stream)
                .toArray();

        System.out.println(Arrays.toString(arrFlat));

        int sum = Arrays.stream(arrFlat).sum();
        
        System.out.println(sum);
    }
}
