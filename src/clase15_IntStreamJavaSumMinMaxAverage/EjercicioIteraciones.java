package clase15_IntStreamJavaSumMinMaxAverage;

import java.util.Arrays;
import java.util.stream.Stream;

public class EjercicioIteraciones {
        public static void main(String[] args) {
        int cantidadValores = 10;

        int[] fibonacci = Stream.iterate(new int[] { 0, 1 }, f -> new int[] { f[1], f[0] + f[1] })
                .limit(cantidadValores)
                .mapToInt(f -> f[0])
                .toArray();

        System.out.println("Cantidad de valores: " + cantidadValores);
        System.out.println(Arrays.toString(fibonacci));
        


        // llenar un array con numeros del 0 al 100


        int[] numeros = Stream.iterate(0, n -> n + 1)
                .limit(cantidadValores)
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println();
        System.out.println("Cantidad de numeros: " + cantidadValores);
        System.out.println(Arrays.toString(numeros));


        // llenar un array con numeros primos

        int[] numerosPrimos = Stream.iterate(2, numero -> numero + 1)
                .filter(EjercicioIteraciones::esPrimo)
                .limit(cantidadValores)
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println();
        System.out.println("Cantidad de numeros primos: " + cantidadValores);
        System.out.println(Arrays.toString(numerosPrimos));
    }

    public static boolean esPrimo(int numero) {
        return numero > 1 && Stream.iterate(2, n -> n + 1)
                .limit((long) Math.sqrt(numero) - 1)
                .noneMatch(n -> numero % n == 0);
    }
}
