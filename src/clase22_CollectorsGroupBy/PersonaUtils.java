package clase22_CollectorsGroupBy;

import java.time.LocalDate;
import java.time.Period;

public class PersonaUtils {

    public static int calcularEdad(Persona persona) {
        return Period.between(persona.getFechaNacimiento(), LocalDate.now()).getYears();
    }
    
    public static char ObtenerInicialNombre(Persona persona) {
        return persona.getNombre().charAt(0);
    }

}
