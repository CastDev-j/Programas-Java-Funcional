package clase11_OmitirElemetosConLambda;

import java.time.Month;

/*
 import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import clase11_OmitirElemetosConLambda.Venta;

public class Main {
    public static void main(String[] args) {

        // I love Functional Programmings

        int skipValue = 6;

        final List<Venta> listaVentas = Stream.of(Month.values())
                .map(month -> new Venta(month, generarDoubleAleatorio()))
                .toList();

        final List<Venta> listaSkipeadaVentas = listaVentas.stream()
                .skip(skipValue)
                .toList();

        System.out.println("Lista de ventas: " + listaVentas);
        System.out.println("Lista de ventas omitiendo los primeros " + skipValue + " elementos: " + listaSkipeadaVentas);
        
        
        


    }

    public static Double generarDoubleAleatorio(){
        return new Random().nextDouble(2000);
    }
}









import java.util.List;
import java.util.Random;

import clase11_OmitirElemetosConLambda.Venta;

public class Main {
    public static void main(String[] args) {

        // 100 numeros aleatorios
        List<Integer> listaNumerica = new Random().ints(0, 100).limit(20).boxed().toList();

        // omitir valores repetidos

        final List<Integer> listaPrimosSinRepetidos = listaNumerica.stream()
                .distinct()
                .filter(numero -> esPrimo(numero))
                .toList();
        
        final List<Integer> listaNumerosSinRepetir = listaNumerica.stream()
                .distinct()
                .toList();

        System.out.println("Lista numérica: " + listaNumerica + "de " + listaNumerica.size() + " elementos");
        System.out.println("Lista numérica sin valores repetidos: " + listaNumerosSinRepetir + "de " + listaNumerosSinRepetir.size() + " elementos");
        System.out.println("Lista de números primos sin valores repetidos: " + listaPrimosSinRepetidos + "de " + listaPrimosSinRepetidos.size() + " elementos");


    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

 */

public class Venta {

    private Month mes;
    private Double total;
    
    public Venta(Month mes, Double total) {
        this.mes = mes;
        this.total = total;
    }

    public Month getMes() {
        return mes;
    }

    public void setMes(Month mes) {
        this.mes = mes;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "mes=" + mes +
                ", total=" + total +
                '}';
    }
}
