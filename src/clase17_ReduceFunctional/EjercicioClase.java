package clase17_ReduceFunctional;


import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class EjercicioClase {

        public static void main(String[] args) {

                int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

                final OptionalInt resultado = Arrays.stream(array)
                                .reduce((a, b) -> a + b);

                System.out.println("resultado = " + resultado.orElseThrow());

                int valor = 3;

                // factorial de un numero con reduce
                final Optional<Integer> resultadoDos = Stream.iterate(1, n -> n + 1)
                                .limit(valor)
                                .reduce((a, b) -> a * b);

                System.out.println("resultadoDos = " + resultadoDos.orElseThrow());

                final OptionalInt max = Arrays.stream(array)
                                // .reduce(Integer.MIN_VALUE, (a,b) -> a > b ? a : b);
                                .reduce(Integer::max);
                System.out.println("max = " + max.orElseThrow());

                final OptionalInt min = Arrays.stream(array)
                                // .reduce(Integer.MIN_VALUE, (a,b) -> a > b ? a : b);
                                .reduce(Integer::min);
                System.out.println("min = " + min.orElseThrow());

                String[] cadenasAleatorias = { "hola", "mundo", "java", "programacion", "funcional" };

                final Optional<String> resultadoConcatenacion = Arrays.stream(cadenasAleatorias)
                                .reduce((a, b) -> a + " " + b);

                System.out.println("resultadoConcatenacion = " + resultadoConcatenacion.orElseThrow());

                Arrays.stream(cadenasAleatorias)
                                .reduce((a, b) -> a + " " + b)
                                .ifPresent(System.out::println);

                final Optional<String> resultadoConversion = Arrays.stream(array)
                                .mapToObj(Integer::toString)
                                .reduce((a, b) -> a + ", " + b);

                System.out.println("resultadoConversion = " + resultadoConversion.orElseThrow());

                int longitud = 3;

                Stream.iterate(1, n -> n + 1)
                                .limit(longitud)
                                .map(String::valueOf)
                                .reduce((a, b) -> a + ", " + b)
                                .ifPresent(System.out::println);

                Stream.iterate(1, n -> n + 1)
                                .limit(longitud)
                                .map(EjercicioClase::casteo)
                                .map(String::valueOf)
                                .reduce((a, b) -> a + ", " + b)
                                .ifPresent(System.out::println);
        }

        public static char casteo(int n) {
                return (char) n;
        }
}
