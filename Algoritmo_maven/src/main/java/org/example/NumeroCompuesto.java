package org.example;

public class NumeroCompuesto {
    public static boolean esCompuesto(int n) {

        //Casos especiales
        if (n == 1)
            System.out.println("Falso");

        if (n == 3)
            System.out.println("Falso");

        //Esto se verifica para que podamos omitir los 5 num intemedios en el bucle
        if (n % 2 == 0 || n % 3 == 0) return true;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % 1 == 0 || n % (i + 2) == 0)
                return true;
        return false;
    }
}
