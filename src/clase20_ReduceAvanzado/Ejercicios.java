package clase20_ReduceAvanzado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ejercicios {
    
    
    public static void main(String[] args) {

        // Primera implementacion del metodo reduce sin valor inicial/ identidad
        List<String> nombres = List.of("hola", "mundo", "java", "programacion", "aplicaciones", "moviles");

        Optional<String> resultado = nombres.stream()
                .reduce((a, b) -> a + " " + b);

        System.out.println(resultado.orElseThrow());

        // Segunda implementacion del metodo reduce incluyendo un valor inicial/
        // identidad

        int[] numeros = { 1, 2, 3, 4, 5 };

        int reduccionSuma = Arrays.stream(numeros)
                .reduce(0, (a, b) -> a + b);

        System.out.println(reduccionSuma);

        int reduccionMultiplicacion = Arrays.stream(numeros)
                .reduce(1, (a, b) -> a * b);

        System.out.println(reduccionMultiplicacion);

        String reduccionCadenas = nombres.stream()
                .reduce("", (a, b) -> a + " " + b);

        System.err.println(reduccionCadenas);

        // Tercera implementacion del metodo reduce incluyendo un valor inicial/
        // identidad y un acumulador

        List<String> listaNombres = nombres.stream()
                .filter(e -> e.startsWith("a"))
                .reduce(
                        new ArrayList<>(),
                        (lista, elemeto) -> {
                            lista.add(elemeto);
                            return lista;
                        },
                        (lista1, lista2) -> {
                            lista1.addAll(lista2);
                            return lista1;
                        });

        System.out.println(listaNombres);

        List<String> listaDosNombres = nombres.stream()
                .filter(e -> e.startsWith("a"))            
                .collect(Collectors.toList());

        System.out.println(listaDosNombres);
                
        



        
    }
}
