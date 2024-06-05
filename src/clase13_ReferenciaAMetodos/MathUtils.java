package clase13_ReferenciaAMetodos;

public class MathUtils {
    
    public static int square(int number){
        return number * number;
    }

    public static int cube(int number){
        return number * number * number;
    }

    public static void printFormatNumber(int number){
        System.out.println("The number is: " + number);
    }

    public static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
