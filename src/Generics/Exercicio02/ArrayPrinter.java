package Generics.Exercicio02;

public class ArrayPrinter {
    // Método genérico para imprimir array de qualquer tipo
    public static <T> void printArray(T[] array) {
        for (T elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Testando com array de Integer
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.print("Array de Integer: ");
        printArray(intArray);

        // Testando com array de Double
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.print("Array de Double: ");
        printArray(doubleArray);

        // Testando com array de String
        String[] stringArray = {"Olá", "Mundo", "Java", "Generics"};
        System.out.print("Array de String: ");
        printArray(stringArray);
    }
}
