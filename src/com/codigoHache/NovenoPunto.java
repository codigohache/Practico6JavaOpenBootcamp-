package com.codigoHache;

import javax.swing.*;

public class NovenoPunto {
    public static void main(String[] args) {
        /*
        ingresar un numero y mostrar su cuadrado, repetir hasta que ingresemos un numero negativo
         */


        int numero, cuadrado;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

        while (numero >= 0) {  //mientras el numero sea 0 o positivo
            cuadrado = (int) Math.pow(numero, 2);
            JOptionPane.showMessageDialog(null, "El numero " + numero + " elevado al cuadrado es: " +cuadrado);

            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));

        }

    }
}
