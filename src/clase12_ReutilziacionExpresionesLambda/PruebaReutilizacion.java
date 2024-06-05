package clase12_ReutilziacionExpresionesLambda;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PruebaReutilizacion {

    public PruebaReutilizacion(){
        probar();
    }
    
    private void probar(){
        // Ejercicio Reutilización de expresiones lambda

        Function<Integer, Predicate<String>> PruebaCaracteres = cantidadCaracteres -> texto -> texto
                .length() == cantidadCaracteres;

        List<String> palabras = List.of("Hola", "Adios", "Buenos dias", "Buenas noches", "Hasta luego", "Hasta pronto",
                "Hasta mañana", "Hasta siempre");

        int cantidadCaracteres = 5;

        palabras.stream()
                .filter(PruebaCaracteres.apply(cantidadCaracteres))
                .forEach(System.out::println);


        // Ejercicio Reutilización de expresiones lambda

        Function<Integer, Predicate<Integer>> pruebaParesMultiplos = multiplo -> valorNumerico -> valorNumerico % multiplo == 0;

        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int multiplo = 4;

        numeros.stream()
                .filter(pruebaParesMultiplos.apply(multiplo))
                .forEach(System.out::println);
        

    }

    
}
