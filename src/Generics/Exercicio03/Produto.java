package Generics.Exercicio03;

public class Produto implements Comparavel<Produto> {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public boolean ehMaiorQue(Produto outro) {
        return this.preco > outro.preco;
    }

    @Override
    public String toString() {
        return nome + " (R$ " + String.format("%.2f", preco) + ")";
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 3500.00);
        Produto produto2 = new Produto("Smartphone", 2500.00);

        System.out.println(produto1 + " é mais caro que " + produto2 + "? " +
                produto1.ehMaiorQue(produto2));

        System.out.println(produto2 + " é mais caro que " + produto1 + "? " +
                produto2.ehMaiorQue(produto1));
    }
}

