package clase01;

import java.util.Locale;

import com.github.javafaker.Faker;

public class FakerUtils {
    private static final Faker faker = new Faker(Locale.of("es", "MX"));

    public static String generarNombre() {
        return faker.name().firstName();
    }

    public static String generarApellido() {
        return faker.name().lastName();
    }

    
}
