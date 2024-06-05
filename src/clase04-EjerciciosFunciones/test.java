package clase04;

//Main codigo clase04

/*
import clase04.IFuncional1;
import clase04.IFuncional2;
import clase04.IFuncional3;
import clase04.IFuncional4;
import clase04.IFuncional5;
import clase04.ITradicional;

public class Main {
    public static void main(String[] args) throws Exception {

        int a = 10;
        int b = 20;
        ejecutorLamdaTipo1(() -> System.out.println("Metodo 1"));

        ejecutorLamdaTipo2(a, valor -> System.out.println("Metodo 2: " + valor));

        ejecutorLamdaTipo3(a, b, (valor1, valor2) -> System.out.println("Metodo 3: " + valor1 + " " + valor2));

        ejecutorLamdaTipo4(() -> {
            int f = 10;
            int g = 20;
            return f + g;
        });

        ejecutorLamdaTipo5(8, 10, (valor1, valor2) -> (int)Math.pow(valor1, valor2));

    }

    private static void ejecutorLamdaTipo5(int a, int b, IFuncional5 funcional) {
        int resultado = funcional.metodo5(a, b);
        System.out.println(resultado);
    }

    private static void ejecutorLamdaTipo4(IFuncional4 funcional) {
        int resultado = funcional.metodo4();
        System.out.println(resultado);
    }

    public static void ejecutorLamdaTipo1(IFuncional1 funcional) {
        funcional.metodo1();
    }

    public static void ejecutorLamdaTipo2(int a, IFuncional2 funcional) {
        funcional.metodo2(a);
    }

    public static void ejecutorLamdaTipo3(int a, int b, IFuncional3 funcional) {
        funcional.metodo3(a, b);
    }

}
*/

public class test implements ITradicional{

    @Override
    public void metodo1() {
        System.out.println("Metodo 1");
    }
    

    @Override
    public void metodo2(int a) {
        System.out.println("Metodo 2");
    }

    @Override
    public void metodo3(int a, int b) {
        System.out.println("Metodo 3");
    }

    @Override
    public int metodo4() {
        System.out.println("Metodo 4");
        return 0;
    }

    @Override
    public int metodo5(int a, int b) {
        System.out.println("Metodo 5");
        return 0;
    }

}
