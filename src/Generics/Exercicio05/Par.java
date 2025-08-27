package Generics.Exercicio05;

public class Par<K, V> {
    private K chave;
    private V valor;

    public Par(K chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public K getChave() {
        return chave;
    }

    public V getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "[" + chave + ": " + valor + "]";
    }

    public static void main(String[] args) {
        // Criando uma lista de pares representando alunos (matrícula, nome)
        java.util.List<Par<Integer, String>> alunos = new java.util.ArrayList<>();

        // Adicionando alguns alunos
        alunos.add(new Par<>(1001, "Ana Silva"));
        alunos.add(new Par<>(1002, "Carlos Oliveira"));
        alunos.add(new Par<>(1003, "Maria Santos"));
        alunos.add(new Par<>(1004, "João Pereira"));

        // Imprimindo todos os pares
        System.out.println("Lista de Alunos (Matrícula: Nome):");
        for (Par<Integer, String> aluno : alunos) {
            System.out.println(aluno);
        }
    }
}

