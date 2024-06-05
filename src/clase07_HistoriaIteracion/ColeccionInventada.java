package clase07_HistoriaIteracion;

import java.util.Iterator;

/*
 import java.util.List;

import clase07_HistoriaIteracion.ColeccionInventada;

public class Main {
    public static void main(String[] args) throws Exception {

        List<String> nombres = List.of("Fernado", "Ana", "Diana", "Jorge");

        //Antigua forma
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }

        //Forma con esteroides de for
        for (String string : nombres) {
            System.out.println(string);
        }

        //otra forma de escribirlo
        nombres.forEach((String nombre) -> {
            System.out.println(nombre);
        });


        //inventando nuestra propia lista generica

        ColeccionInventada<String> colleccion = new ColeccionInventada<>();

        colleccion.add("Fernando");
        colleccion.add("Ana");
        colleccion.add("Diana");
        colleccion.add("Jorge");
        colleccion.add("Jorge");


        for (String string : colleccion) {
            System.out.println(string);
        }

        System.out.println("Tamaño de la colleccion: " + colleccion.size());

    }
}
 */

public class ColeccionInventada<E> implements Iterable<E> {

    private E[] array;
    private static final int DEFAULT_CAPACITY = 10;
    private int size;

    public ColeccionInventada() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ColeccionInventada(int capacidad) {
        size = 0;
        array = (E[]) new Object[capacidad];
    }

    public void add(E e) {
        ensureCapacity();
        array[size++] = e;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            int newSize = array.length * 2;
            @SuppressWarnings("unchecked")
            E[] newArray = (E[]) new Object[newSize];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new IndexOutOfBoundsException("No hay más elementos");
                }
                return array[currentIndex++];
            }
        };
    }

}
