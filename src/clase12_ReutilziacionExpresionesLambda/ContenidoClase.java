package clase12_ReutilziacionExpresionesLambda;


import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class ContenidoClase {
    public static void main(String[] args) {
        // Requisito: es filtrar todos los nombres que empiezen con:

        // public static Predicate<String> filtrarNombres(final String letra) {
        // return name -> name.startsWith(letra);
        // }

        // Predicate<String> startsWhitLetter = name -> name.startsWith(letra);

        Function<String, Predicate<String>> filtrarNombres = letra -> name -> name.startsWith(letra);

        List<String> amigos = List.of("Maria", "Ana", "Lucia", "Pedro", "Jose", "Carlos", "Javier");
        List<String> enemigos = List.of("Pedro", "Jose", "Carlos", "Javier");
        List<String> conocidos = List.of("Pepe", "Juan", "Luis");

        String letra = "L";

        final List<String> amigosConLetra = amigos.stream()
                .map(nombre -> nombre.toUpperCase())
                .filter(filtrarNombres.apply(letra))
                .toList();

        final List<String> enemigosConLetra = enemigos.stream()
                .map(nombre -> nombre.toUpperCase())
                .filter(filtrarNombres.apply(letra))
                .toList();

        final List<String> conocidosConLetra = conocidos.stream()
                .map(nombre -> nombre.toUpperCase())
                .filter(filtrarNombres.apply(letra))
                .toList();

        System.out.println("Amigos con la letra " + letra + ": " + amigosConLetra);
        System.out.println("Enemigos con la letra " + letra + ": " + enemigosConLetra);
        System.out.println("Conocidos con la letra " + letra + ": " + conocidosConLetra);

    }

}
