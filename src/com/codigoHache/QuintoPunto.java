package com.codigoHache;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class QuintoPunto {
    public static void main(String[] args) {
        /*
        5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
        Recorre ambos mostrando únicamente el valor de cada elemento.
         */

        ArrayList<String> list = new ArrayList<String>();

        list.add ("Argentina");
        list.add ("España");
        list.add ("Portugal");
        list.add ("Francia");

        for (String paises : list) {
            System.out.println(paises);
        }

        System.out.println();
        LinkedList<String> copyList = new LinkedList<String>();

        for (String insert: list) {
            copyList.add(insert);
        }

        for (String linked : copyList) {
            System.out.println(linked);
        }
    }
}
