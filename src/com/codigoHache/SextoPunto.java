package com.codigoHache;

import java.util.ArrayList;

public class SextoPunto {
    public static void main(String[] args) {
        /*
        6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
         A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a
         recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y
           cuando cumplas el primer "for" de relleno.
         */

        ArrayList<Integer> listNumero = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            listNumero.add(i);
        }
        System.out.println(listNumero);

        for (int i = 0; i < listNumero.size(); i++) {
            if (listNumero.get(i) % 2 == 0) {
                listNumero.remove(i);
                i--;
            }
        }
        System.out.println(listNumero);
    }

}
