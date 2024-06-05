

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Coodigo Main de la clase02
/* 
 
import clase02.Ventana;

public class Main {
    public static void main(String[] args) throws Exception {

        Ventana ventana = new Ventana("Aprendiendo Lambdas");
    }
}


*/

public class Ventana extends JFrame{

    int counter = 0;

    public Ventana(String title){
        this.setTitle(title);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton boton = new JButton("Click");
        JButton boton2 = new JButton("Click2");

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Boton 2");
                System.out.println("Click " + ++counter);
                System.out.println();
            }
        });

        boton.addActionListener(e -> {
            System.out.println("Boton 1");
            System.out.println("Click " + ++counter);
            System.out.println();
        });

        this.setLayout(new FlowLayout());

        add(boton2);
        add(boton);

        this.setVisible(true);
    }





}
