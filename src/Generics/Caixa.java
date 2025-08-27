package Generics;

public class Caixa<T> {
    private T conteudo;

    public void set( T conteudo) {
        this.conteudo = conteudo;
    }

    public T get() {
        return conteudo;
    }

    public static void main(String[] args) {
        // Testando com String
        Caixa<String> caixaString = new Caixa<>();
        caixaString.set("Olá, Mundo!");
        System.out.println("Conteúdo da caixa (String): " + caixaString.get());

        // Testando com Integer
        Caixa<Integer> caixaInt = new Caixa<>();
        caixaInt.set(42);
        System.out.println("Conteúdo da caixa (Integer): " + caixaInt.get());

        // Testando com Double
        Caixa<Double> caixaDouble = new Caixa<>();
        caixaDouble.set(3.14159);
        System.out.println("Conteúdo da caixa (Double): " + caixaDouble.get());
    }
}
