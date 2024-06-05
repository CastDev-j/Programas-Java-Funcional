package clase10_FiltrarInformacionStream;

import java.util.function.Predicate;

/*
 import java.util.List;

import clase10_FiltrarInformacionStream.Predicator;

public class Main {
    public static void main(String[] args) {
     
        List<String> listaNombres = List.of("Juan", "Pedro", "Anabel", "Luis", "Ana", "Maria", "Jose", "Luisa", "Pepe", "Paco",
                "Pablo");

        final List<String> listaNombresFiltrados = listaNombres.stream()
                .map(nombre -> nombre.toLowerCase())
                .filter(cadena -> cadena.startsWith("a"))
                .filter(cadena -> cadena.endsWith("a"))
                .filter(cadena -> cadena.contains("n"))
                .map(nombre -> nombre.toUpperCase())
                .toList();

        listaNombresFiltrados.forEach(System.out::println);
    }
}

        List<Integer> listaNumeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 9);

        final List<Integer> listaNumerosPares = listaNumeros.stream()
            .filter(numero -> numero % 2 == 0)
            .toList();

        final List<Integer> listaNumerosImpares = listaNumeros.stream()
            .filter(numero -> numero % 2 == 1)
            .toList();

        final int sumaNumeros = listaNumeros.stream()
            .reduce(0, (a, b) -> a + b);

        final int promedioNumeros = sumaNumeros / listaNumeros.size();

        System.out.println("Lista de números: " + listaNumeros);

        System.out.println("Lista de números pares: " + listaNumerosPares);

        System.out.println("Lista de números impares: "+ listaNumerosImpares);

        System.out.println("Suma de todos los numeros: "+ sumaNumeros);

        System.out.println("Promedio de todos los numeros: "+ promedioNumeros);

        
 */

public class Predicator implements Predicate<String> {

    @Override
    public boolean test(String t) {
        return t.toLowerCase().startsWith("a");
    }
}
