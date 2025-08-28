package Generics.Exercicio07;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Pilha<T> {
    private List<T> elementos;
    private int topo;

    public Pilha() {
        this.elementos = new ArrayList<>();
        this.topo = -1;
    }

    public void push(T elemento) {
        elementos.add(elemento);
        topo++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T elemento = elementos.get(topo);
        elementos.remove(topo--);
        return elemento;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elementos.get(topo);
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public int size() {
        return topo + 1;
    }

    public static void main(String[] args) {
        // Testando com Integer
        System.out.println("=== Testando Pilha de Integer ===");
        Pilha<Integer> pilhaInt = new Pilha<>();
        pilhaInt.push(10);
        pilhaInt.push(20);
        pilhaInt.push(30);
        System.out.println("Topo: " + pilhaInt.peek()); // Deve mostrar 30
        System.out.println("Tamanho: " + pilhaInt.size()); // Deve mostrar 3
        System.out.println("Removido: " + pilhaInt.pop()); // Deve remover 30
        System.out.println("Novo topo: " + pilhaInt.peek()); // Deve mostrar 20

        // Testando com String
        System.out.println("\n=== Testando Pilha de String ===");
        Pilha<String> pilhaStr = new Pilha<>();
        pilhaStr.push("Primeiro");
        pilhaStr.push("Segundo");
        pilhaStr.push("Terceiro");
        System.out.println("Topo: " + pilhaStr.peek()); // Deve mostrar "Terceiro"
        System.out.println("Tamanho: " + pilhaStr.size()); // Deve mostrar 3
        System.out.println("Removido: " + pilhaStr.pop()); // Deve remover "Terceiro"
        System.out.println("Novo topo: " + pilhaStr.peek()); // Deve mostrar "Segundo"
    }
}
