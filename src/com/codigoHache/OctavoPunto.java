package com.codigoHache;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class OctavoPunto {
    public static void main(String[] args) {
        // printStream imprime por consola
        try {
            InputStream in = new FileInputStream("/etc/passwd");
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(System.out);
            out.write(datos);
            out.close();

        }catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }

    }

    private void close() {
    }

    private void write(byte[] datos) {
    }
}
