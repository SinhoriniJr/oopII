package Generics.Exercicio04;

import java.util.List;

public class MaxFinder {
    // Método genérico para encontrar o maior elemento em uma lista de Comparables
    public static <T extends Comparable<T>> T max(List<T> lista) {
        if (lista == null || lista.isEmpty()) {
            throw new IllegalArgumentException("A lista não pode ser nula ou vazia");
        }

        T max = lista.get(0);
        for (T elemento : lista) {
            if (elemento.compareTo(max) > 0) {
                max = elemento;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Testando com Integer
        List<Integer> numeros = List.of(10, 5, 8, 15, 3);
        System.out.println("Maior número: " + max(numeros));

        // Testando com Double
        List<Double> decimais = List.of(3.14, 2.71, 1.618, 2.718);
        System.out.println("Maior decimal: " + max(decimais));

        // Testando com String
        List<String> palavras = List.of("banana", "abacaxi", "laranja", "uva");
        System.out.println("Última palavra em ordem alfabética: " + max(palavras));
    }
}

