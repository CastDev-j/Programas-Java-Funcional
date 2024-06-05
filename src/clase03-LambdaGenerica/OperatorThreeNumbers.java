

/* Main clase03

import clase03.Operator;
import clase03.OperatorThreeNumbers;

public class Main {
    public static void main(String[] args) throws Exception {


        double a = 10;
        double b = 5;

        int c = 10;
        int d = 5;

        long e = 10;
        long f = 5;

        float g = 10;
        float h = 5;


        System.out.println(operate(a, b, (x, y) -> x + y));
        System.out.println(operate(c, d, (x, y) -> x - y));
        System.out.println(operate(e, f, (x, y) -> x * y));
        System.out.println(operate(g, h, (x, y) -> x / y));

        //promedio

        System.out.println("Promedio: 10 y 5");
        System.out.println(operate(a, b, (x,y) -> (x + y) / 2));

        //interes

        float INTERES_ANUAL = 0.1f;

        System.out.println("Interes: 10%");
        System.out.println(operate(g, INTERES_ANUAL, (x,y) -> x * y));

        System.out.println("Interes final: 10%");
        System.out.println(operate(g, INTERES_ANUAL, (x,y) -> x + (x * y)));


        //Interes compuesto

        int ANIOS_PRUEBA = 5;
        double INTERES_ANUAL_COMPUESTO = 0.1;
        double CANTIDAD_EJEMPLO = 1000; 

        System.out.println("Interes compuesto: 10% durante 5 años de 1000$");
        double interesCompuesto = operate((double)ANIOS_PRUEBA, CANTIDAD_EJEMPLO, INTERES_ANUAL_COMPUESTO, (tiempo, cantidad, interes) -> cantidad *(Math.pow(1+ interes, tiempo)));

        System.out.println(String.format("Cantidad final: %.2f$", interesCompuesto));






    }

    public static <T extends Number> T operate(T a, T b, Operator<T> operator) {
        return operator.apply(a, b);
    }

    public static <T extends Number> T operate(T a, T b, T c, OperatorThreeNumbers<T> operator) {
        return operator.applyNumbers(a, b, c);
    }


}

 */

@FunctionalInterface
public interface OperatorThreeNumbers<T> {
    
    T applyNumbers(T a, T b, T c);
    
}
