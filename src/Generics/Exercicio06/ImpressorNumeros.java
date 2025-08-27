package Generics.Exercicio06;

import java.util.List;

public class ImpressorNumeros {
    // Método que aceita uma lista de qualquer tipo que seja Number ou seus subtipos
    public static void imprimirNumeros(List<? extends Number> lista) {
        for (Number numero : lista) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Testando com lista de Integer
        List<Integer> inteiros = List.of(1, 2, 3, 4, 5);
        System.out.print("Lista de Integer: ");
        imprimirNumeros(inteiros);

        // Testando com lista de Double
        List<Double> decimais = List.of(1.5, 2.7, 3.1, 4.9);
        System.out.print("Lista de Double: ");
        imprimirNumeros(decimais);

        // Testando com lista de Float
        List<Float> floats = List.of(1.1f, 2.2f, 3.3f, 4.4f);
        System.out.print("Lista de Float: ");
        imprimirNumeros(floats);

        // Testando com lista de Long
        List<Long> longos = List.of(1000L, 2000L, 3000L);
        System.out.print("Lista de Long: ");
        imprimirNumeros(longos);
    }
}

