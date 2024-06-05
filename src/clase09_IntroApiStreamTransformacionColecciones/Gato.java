package clase09_IntroApiStreamTransformacionColecciones;
/* clase principal bien maniacota

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import clase09_IntroApiStreamTransformacionColecciones.Gato;
import clase09_IntroApiStreamTransformacionColecciones.Perro;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) throws Exception {

        Function<Perro, Gato> mutacion = perro -> new Gato(perro.getNombre());
        System.out.println(mutacion.apply(new Perro("Firulais")));

        List<String> listaNombres = List.of("Juan", "Pedro", "Luis", "Ana", "Maria", "Jose", "Luisa", "Pepe", "Paco",
                "Pablo");

        final List<String> listaNombresMayusculas = listaNombres.stream()
                .map(nombre -> nombre.toUpperCase())
                .toList();

        System.out.println(listaNombresMayusculas);

        String[] arrayNombres = { "Juan", "Pedro", "Luis", "Ana", "Maria", "Jose", "Luisa", "Pepe", "Paco", "Pablo" };

        final List<Perro> listaPerros = Stream.of(arrayNombres)
                .map(nombre -> new Perro(nombre))
                .toList();

        listaPerros.forEach(perro -> {
            System.out.print("Soy un perro, mi nombre: ");
            System.out.println(perro.getNombre());
        });

        // ejercicio arreglo de numeros, hacer el producto de n numeros seguidos, almacenar n numeros del producto en una lista


        // version no optimizada (la mia)

        int[] arrayNumeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        int cantidadNumeros = 2;

        long startTime = System.currentTimeMillis();

        final List<List<Integer>> listaValoresProducto = Stream.iterate(0, i -> i + 1)
                .limit(arrayNumeros.length - cantidadNumeros + 1)
                .map(i -> {
                    List<Integer> listaProducto = new ArrayList<>();
                    for (int j = i; j < i + cantidadNumeros; j++) {
                        listaProducto.add(arrayNumeros[j]);
                    }
                    return listaProducto;
                })
                .toList();

        final List<Integer> listaProductos = listaValoresProducto.stream()
                .map(listaNumeros -> listaNumeros.stream().reduce(1, (a, b) -> a * b))
                .toList();
        
        long endTime = System.currentTimeMillis();
        
        System.out.println(listaValoresProducto);
        System.out.println(listaProductos);

        long duration = endTime - startTime; 
        System.out.println("Tiempo de ejecución: " + duration + " milisegundos");

        // Version optimizada 

        long startTime2 = System.currentTimeMillis();

        final List<List<Integer>> listaValoresProducto2 = Stream.iterate(0, i -> i + 1)
                .limit(arrayNumeros.length - cantidadNumeros + 1)
                .map(i -> {
                    List<Integer> listaProducto = new ArrayList<>();
                    for (int j = i; j < i + cantidadNumeros; j++) {
                        listaProducto.add(arrayNumeros[j]);
                    }
                    return listaProducto;
                })
                .toList();

        final List<Integer> listaProductos2 = listaValoresProducto.stream()
                .map(listaNumeros -> listaNumeros.stream().reduce(1, (a, b) -> a * b))
                .toList();

        long endTime2 = System.currentTimeMillis();

        System.out.println(listaValoresProducto2);
        System.out.println(listaProductos2);

        long duration2 = endTime2 - startTime2; 
        System.out.println("Tiempo de ejecución: " + duration2 + " milisegundos");
        
    }
}

 
 */
public class Gato {
    private String nombre;

    public Gato(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "gato{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
