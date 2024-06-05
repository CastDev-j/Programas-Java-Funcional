package clase08_IteracionFuncionalForEach;

import java.util.function.Consumer;

/*
 import java.util.Arrays;
import java.util.List;



public class Main {
    public static void main(String[] args) throws Exception {

        List<String> listaNombres = List.of("Juan", "Pedro", "Luis", "Ana", "Maria", "Jose", "Luisa", "Pepe", "Paco",
                "Pablo");

        listaNombres.forEach(s ->{
            int[] caracteres = s.chars().toArray();
            System.out.println(Arrays.toString(caracteres));

            s.chars().forEach(c -> {
                char letra = (char) c;
                System.out.print(letra == s.charAt(s.length() - 1) ? letra : letra + "-");
            });
            System.out.println();
            
            System.out.println(s);
            System.out.println();
        });

  
    }
}
 */

public class Consumidor implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
