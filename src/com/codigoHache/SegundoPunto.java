package com.codigoHache;
import java.util.Scanner;
public class SegundoPunto {
    public static void main(String[] args) {
       // 2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición
        // y el valor de cada elemento en ambas dimensiones.

          Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del Array: ");

        int n= teclado.nextInt();
        int array[] = new int[n];

       for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese dato " + (i + 1) + ": ");
            array[i] = teclado.nextInt();
        }
        System.out.println();
        System.out.println("Recorrido del array de Izquierda a Derecha ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println("\nRecorrido del array de Derecha a Izquierda ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }




            }

    }







