package com.codigoHache;

public class MensajeDiabolico {
    public static void main(String[] args) {
        //Escribe el código que devuelva una cadena al reves.
        // Por ejemplo, la cadena "hola mundo" debe retornar "odnum alon"


        String cadena = "Hola Mundo";
        System.out.println(cadena);

        System.out.println();



            for (int i= cadena.length()-1; i >= 0; i--) {
                System.out.print( cadena.charAt(i));
            }
        }
    }

