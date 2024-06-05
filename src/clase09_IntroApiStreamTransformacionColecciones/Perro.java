package clase09_IntroApiStreamTransformacionColecciones;

public class Perro {
    private String nombre;

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "perro{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
