package clase21_ComparatorAvanzado;


public class PersonaUtils {

    public static int compararPorNombre(Persona p1, Persona p2) {
        return p1.getNombre().compareTo(p2.getNombre());
    }

    public static int compararPorEdad(Persona p1, Persona p2) {
        return p1.getEdad() - p2.getEdad();
    }

    
    
}