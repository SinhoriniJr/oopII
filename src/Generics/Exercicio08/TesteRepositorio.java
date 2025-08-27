package Generics.Exercicio08;

import java.util.List;

public class TesteRepositorio {
    public static void main(String[] args) {
        // Testando Repositório de Produtos
        System.out.println("=== Testando Repositório de Produtos ===");
        Repositorio<Produto, Integer> repoProduto = new RepositorioProduto();

        // Criando alguns produtos
        Produto p1 = new Produto("Notebook", 3500.00);
        Produto p2 = new Produto("Smartphone", 2500.00);
        Produto p3 = new Produto("Tablet", 1200.00);

        // Salvando produtos
        System.out.println("\nSalvando produtos...");
        repoProduto.salvar(p1);
        repoProduto.salvar(p2);
        repoProduto.salvar(p3);

        // Buscando por ID
        System.out.println("\nBuscando produtos por ID:");
        System.out.println("Produto com ID 1: " + repoProduto.buscarPorId(1));
        System.out.println("Produto com ID 2: " + repoProduto.buscarPorId(2));

        // Listando todos os produtos
        System.out.println("\nListando todos os produtos:");
        List<Produto> todosProdutos = repoProduto.listarTodos();
        todosProdutos.forEach(System.out::println);

        // Testando busca por nome (método específico de RepositorioProduto)
        System.out.println("\nBuscando produtos com 'note' no nome:");
        ((RepositorioProduto) repoProduto).buscarPorNome("note").forEach(System.out::println);

        // Testando Repositório de Clientes
        System.out.println("\n=== Testando Repositório de Clientes ===");
        Repositorio<Cliente, Integer> repoCliente = new RepositorioCliente();

        // Criando alguns clientes
        Cliente c1 = new Cliente("João Silva", "joao@email.com");
        Cliente c2 = new Cliente("Maria Santos", "maria@email.com");
        Cliente c3 = new Cliente("Carlos Oliveira", "carlos@email.com");

        // Salvando clientes
        System.out.println("\nSalvando clientes...");
        repoCliente.salvar(c1);
        repoCliente.salvar(c2);
        repoCliente.salvar(c3);

        // Buscando por ID
        System.out.println("\nBuscando clientes por ID:");
        System.out.println("Cliente com ID 1: " + repoCliente.buscarPorId(1));
        System.out.println("Cliente com ID 3: " + repoCliente.buscarPorId(3));

        // Listando todos os clientes
        System.out.println("\nListando todos os clientes:");
        List<Cliente> todosClientes = repoCliente.listarTodos();
        todosClientes.forEach(System.out::println);

        // Testando busca por nome (método específico de RepositorioCliente)
        System.out.println("\nBuscando clientes com 'maria' no nome:");
        ((RepositorioCliente) repoCliente).buscarPorNome("maria").forEach(System.out::println);
    }
}

