package clase19_IteracionesCadenasFuncionales;

import java.util.Arrays;
import java.util.Optional;

public class EjercicioClase {
    

    public static void main(String[] args) {

        String[] arr = {"hola", "mundo", "java", "programacion"};

        Optional<String> resultado = Arrays.stream(arr)
            .reduce((a, b) -> a + " " + b);
        System.out.println(resultado.orElseThrow());
    
        System.out.println(String.join(" ", arr));

        String cadena = "hola mundo java programacion";

        cadena.chars()
            .filter(c -> c != 'a')
            .forEach(EjercicioClase::printChar);
    }

    public static void printChar(int value) {
        System.out.print((char) value);
    }

}
