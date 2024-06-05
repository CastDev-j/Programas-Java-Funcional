package clase06_CallBackHighOrderFunction;

/*
 import clase06.Function;

public class Main {
    public static void main(String[] args) throws Exception {


         * High order functions
         * callback


         int valor = 3;

         Function<Integer, Integer> square = x -> x * x;
         Function<Integer, Integer> cube = x -> x * x * x;
 
         Function<Integer, Integer> cajita = functionSupplier();
 
         System.out.println(applyFunction(valor, square));
         
         System.out.println(applyFunction(valor, cube));
 
         System.out.println(applyFunction(valor, cajita));
     }
 
     public static Integer applyFunction(Integer x, Function<Integer, Integer> f) {
         return f.apply(x);
     }
 
     public static Function<Integer, Integer> functionSupplier(){
         return x -> x*x*x*x;
     }
 }
 */

@FunctionalInterface
public interface Function <T, R>{

    R apply(T t);
    
}
