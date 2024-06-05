package clase13_ReferenciaAMetodos;

/* clase 13: Referencia a metodos de distintas formas
 import java.util.List;
import java.util.stream.Stream;

import clase13_ReferenciaAMetodos.Person;
import clase13_ReferenciaAMetodos.MathUtils;

public class Main {
    public static void main(String[] args) {


         * Methods References



        // 1.- Reference to a static method

        Integer[] arrayNumbers = { 2, 8, 9, 10 };

        System.out.println("Original List:");
        System.out.println(List.of(arrayNumbers));

        System.out.println();

        System.out.println("Square:");

        final List<Integer> squareList = Stream.of(arrayNumbers)
                .map(MathUtils::square)
                .toList();

        System.out.println(squareList);

        System.out.println();

        System.out.println("Cube:");

        final List<Integer> cubeList = Stream.of(arrayNumbers)
                .map(MathUtils::cube)
                .toList();

        System.out.println(cubeList);

        final Integer maxValue = Stream.of(arrayNumbers)
                .max(Integer::compareTo)
                .get();

        System.out.println();
        System.out.println("Max Value: " + maxValue);

        final Integer minValue = Stream.of(arrayNumbers)
                .min(Integer::compareTo)
                .get();

        System.out.println();
        System.out.println("Min Value: " + minValue);

        System.out.println();
        System.out.println("numbers:");

        Stream.of(arrayNumbers)
                .map(MathUtils::cube)
                .forEach(MathUtils::printFormatNumber);

        System.out.println();
        System.out.println("Prime numbers:");
        List<Integer> primeList = Stream.of(arrayNumbers)
                .filter(MathUtils::isPrime)
                .toList();

        System.out.println(primeList);

        // 2.- Reference to constructor
        System.out.println();
        String[] names = { "Juan", "Pedro", "Maria", "Luisa" };

        final List<Person> persons = Stream.of(names)
                .map(Person::new)
                .toList();

        System.out.println("List of Persons:");
        System.out.println(persons);

        // 3.- Reference to an instance method of an arbitrary object of a particular
        // type

        System.out.println();

        final List<String> listOfNames = persons.stream()
            .map(Person::getName)
            .toList();

        System.out.println("List of names:");
        System.out.println(listOfNames);



    }

}
 */

public class Person {
    
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void imprimirNombre(){
        System.out.println("Nombre: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String nombre) {
        this.name = nombre;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + name + "]";
    }

    
}
