
package clase21_ComparatorAvanzado;
import static java.util.Comparator.comparing;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;


public class Main {
    public static void main(String[] args) {
    
        // Crear una lista de personas

        List<Persona> personas = List.of(
                new Persona("Juan", 22),
                new Persona("Juan", 20),
                new Persona("Pedro", 30),
                new Persona("Ana", 25),
                new Persona("Maria", 40));

        // Ordenar por nombre

        personas.stream()
                .sorted(PersonaUtils::compararPorNombre)
                .forEach(System.out::println);

        System.out.println("----------");

        personas.stream()
                .sorted(Collections.reverseOrder(PersonaUtils::compararPorNombre))
                .forEach(System.out::println);

        System.out.println("----------");

        personas.stream()
                .sorted(PersonaUtils::compararPorEdad)
                .forEach(System.out::println);

        System.out.println("----------");

        personas.stream()
                .sorted(Collections.reverseOrder(PersonaUtils::compararPorEdad))
                .forEach(System.out::println);


        // Otra forma de hacerlo

        Comparator<Persona> comparadorNombre = PersonaUtils::compararPorNombre;
        Comparator<Persona> comparadorNombreReversa = comparadorNombre.reversed();

        Comparator<Persona> comparadorEdad = PersonaUtils::compararPorEdad;
        Comparator<Persona> comparadorEdadReversa = comparadorEdad.reversed();

        personas.stream()
                .sorted(comparadorNombre)
                .forEach(System.out::println);
        
        System.out.println("----------");

        personas.stream()
                .sorted(comparadorNombreReversa)
                .forEach(System.out::println);

        System.out.println("----------");

        personas.stream()
                .sorted(comparadorEdad)
                .forEach(System.out::println);

        System.out.println("----------");

        personas.stream()
                .sorted(comparadorEdadReversa)
                .forEach(System.out::println);

        // Reduccion distinta con comparators

        System.out.println("----------");

        personas.stream()
                .min(comparadorNombre)
                .ifPresent(System.out::println);

        System.out.println("----------");

        personas.stream()
                .max(comparadorNombre)
                .ifPresent(System.out::println);

        //comparator comparing el metodo poderoso 

        Function<Persona, Integer> porEdad = Persona::getEdad;
        Function<Persona, String> porNombre = Persona::getNombre;

        System.out.println("----------");

        personas.stream()
                .sorted(comparing(porEdad))
                .forEach(System.out::println);

        System.out.println("----------");

        personas.stream()
                .sorted(comparing(porNombre).thenComparing(porEdad))
                .forEach(System.out::println);
                


    }
}
