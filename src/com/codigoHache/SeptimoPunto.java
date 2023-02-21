package com.codigoHache;

import java.util.Scanner;

public class SeptimoPunto {
    public static void main(String[] args) {
        /*
        Crea una función DividePorCero. Esta, debe generar una excepción ("throws")
        a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main"
por eiemplo). Si se dispara la excepción. mostraremos el mensaie "Esto no puede hacerse". Finalmente,
 mostraremos en cualauier caso: "Demo de códiao"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("INtroduce dos numeros enteros: ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        try{
            int resultado = num1/num2;
            System.out.println("El resultado es: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("B00MM!! excepcion es: " + e.getClass());
        } finally {
            System.out.println("Demo de código");
        }
    }


    }

