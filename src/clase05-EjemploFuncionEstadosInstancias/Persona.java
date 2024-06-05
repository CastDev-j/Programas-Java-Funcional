

/* codigo main clase 05

 import javax.swing.JButton;
import javax.swing.JFrame;

import clase05.Persona;

public class Main {
    public static void main(String[] args) throws Exception {

        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton button = new JButton("jajaja");

        Persona persona = new Persona("Juan", 20);

        System.out.println(persona.getEdad());
        button.addActionListener(e -> {
            System.out.println("jajaja");
            persona.cumplirAnios();
            System.out.println(persona.getEdad());
        });


        frame.add(button);
        frame.setVisible(true);
        }
        

        
    }


 */

public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }

    public void cumplirAnios() {
        edad++;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
}
