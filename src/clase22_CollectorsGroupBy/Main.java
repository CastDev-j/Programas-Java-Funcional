package clase22_CollectorsGroupBy;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


import static java.util.stream.Collectors.groupingBy;


public class Main {
    public static void main(String[] args) {
    
        List<Persona> lista30Pesonas = List.of(
                new Persona("Juan", "Perez", LocalDate.of(1990, 1, 1)),
                new Persona("Maria", "Gomez", LocalDate.of(1990, 2, 2)),
                new Persona("Carlos", "Lopez", LocalDate.of(1990, 3, 3)),
                new Persona("Ana", "Rodriguez", LocalDate.of(1990, 4, 4)),
                new Persona("Pedro", "Gonzalez", LocalDate.of(1990, 5, 5)),
                new Persona("Lucia", "Fernandez", LocalDate.of(1990, 6, 6)),
                new Persona("Luis", "Martinez", LocalDate.of(1990, 7, 7)),
                new Persona("Laura", "Sanchez", LocalDate.of(1990, 8, 8)),
                new Persona("Jorge", "Perez", LocalDate.of(1990, 9, 9)),
                new Persona("Marta", "Gomez", LocalDate.of(1990, 10, 10)),
                new Persona("Carlos", "Lopez", LocalDate.of(1990, 11, 11)),
                new Persona("Ana", "Rodriguez", LocalDate.of(1990, 12, 12)),
                new Persona("Pedro", "Gonzalez", LocalDate.of(1990, 1, 1)),
                new Persona("Lucia", "Fernandez", LocalDate.of(1990, 2, 2)),
                new Persona("Luis", "Martinez", LocalDate.of(1990, 3, 3)),
                new Persona("Laura", "Sanchez", LocalDate.of(1990, 4, 4)),
                new Persona("Jorge", "Perez", LocalDate.of(1990, 5, 5)),
                new Persona("Marta", "Gomez", LocalDate.of(1990, 6, 6)),
                new Persona("Carlos", "Lopez", LocalDate.of(1990, 7, 7)),
                new Persona("Ana", "Rodriguez", LocalDate.of(1990, 8, 8)),
                new Persona("Pedro", "Gonzalez", LocalDate.of(1990, 9, 9)),
                new Persona("Lucia", "Fernandez", LocalDate.of(1990, 10, 10)),
                new Persona("Luis", "Martinez", LocalDate.of(1990, 11, 11)),
                new Persona("Laura", "Sanchez", LocalDate.of(1990, 12, 12)),
                new Persona("Jorge", "Perez", LocalDate.of(1990, 1, 1)),
                new Persona("Marta", "Gomez", LocalDate.of(1990, 2, 2)),
                new Persona("Carlos", "Lopez", LocalDate.of(1990, 3, 3)),
                new Persona("Ana", "Rodriguez", LocalDate.of(1990, 4, 4)),
                new Persona("Pedro", "Gonzalez", LocalDate.of(1990, 5, 5)),
                new Persona("Lucia", "Fernandez", LocalDate.of(1990, 6, 6))
        );
    

    System.out.println("Lista de personas: " + lista30Pesonas.size());

    lista30Pesonas.stream()
        .collect(groupingBy(Persona::getNombre))
        .forEach((apellido, personas) -> System.out.println(apellido + " -> " + personas.size()));

    List<String> listaAgrupada = lista30Pesonas.stream()
        .collect(groupingBy(Persona::getApellido))
        .entrySet()
        .stream()
        .map(entry -> entry.getKey() + " -> " + entry.getValue().size())
        .collect(Collectors.toList());

    System.out.println(listaAgrupada);

    final Map<Integer, List<Persona>> resultado =  lista30Pesonas.stream()
        .collect(groupingBy(PersonaUtils::calcularEdad));
        
    resultado.forEach((edad, personas) -> System.out.println("Edad: "+ edad + " -> " + "Cantidad personas: "+personas.size()));
        
    System.out.println();
    //Ejercicio 2

    final Map<Character,List<Persona>> listaAgrupadaPorLetra = lista30Pesonas.stream()
        .collect(groupingBy(PersonaUtils::ObtenerInicialNombre));

    listaAgrupadaPorLetra.forEach(
        (letra, listaPersonas) -> {
            System.out.println("Letra: " + letra);
            System.out.println();
            listaPersonas.forEach(persona -> System.out.println(persona.getNombre()));
            System.out.println();
        }
    );



    }
}
