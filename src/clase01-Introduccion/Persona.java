package clase01;

// Coodigo Main de la clase01
/*
import java.util.ArrayList;
import java.util.List;

import clase01.FakerUtils;
import clase01.Persona;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello");
        List<Persona> listaPersonas = generarPersonas(100);
        listaPersonas.add(new Persona("Ana", "Castillo"));

        System.out.println("Desordenado");
        System.out.println(listaPersonas);

        System.out.println();
        System.out.println("Ordenado por nombre");
        listaPersonas.sort((p1, p2) -> Integer.compare(p1.getNombre().length(),(p2.getNombre().length())));
        System.out.println(listaPersonas);
        
    }

    private static List<Persona> generarPersonas(int cantidad) {
        List<Persona> personas = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            String nombre = FakerUtils.generarNombre();
            String apellido = FakerUtils.generarApellido();
            personas.add(new Persona(nombre, apellido));
        }
        return personas;
    }
}

 */



public class Persona {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    

    @Override
    public String toString() {
        return '('+ nombre + ", " + apellido + ')';
    }
}
