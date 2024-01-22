package org.example;

public class Main {
    public static void main(String[] args) {


        //int i = new Scanner(System.in);
        int i = 19;
        //Scanner i = new Scanner(int)
        NumeroCompuesto.esCompuesto(i);

        if (NumeroCompuesto.esCompuesto(i))
            System.out.println("El numero " + i + " es compuesto");
        else
            System.out.println("El numero " + i + " es primo");


    }

}