package com.codigoHache;
import java.util.Vector;
public class TercerPunto {
    public static void main(String[] args) {
        /*
        3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
         Elimina el 20 y 3er elemento y muestra el resultado final.
         */

        Vector <Integer> miVector = new Vector<Integer>();

        miVector.add (1);
        miVector.add (2);
        miVector.add (3);
        miVector.add (4);
        miVector.add (5);

        miVector.remove (2);
        miVector.remove (3);

        System.out.println(miVector);
        


    }
}
