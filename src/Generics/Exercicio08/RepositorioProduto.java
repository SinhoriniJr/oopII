package Generics.Exercicio08;

import java.util.List;
import java.util.stream.Collectors;

public class RepositorioProduto extends RepositorioMemoria<Produto, Integer> {

    @Override
    public void salvar(Produto produto) {
        produto.setId(proximoId++);
        super.salvar(produto);
    }

    @Override
    public Produto buscarPorId(Integer id) {
        return itens.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Método adicional para buscar produtos por nome (exemplo de método específico)
    public List<Produto> buscarPorNome(String nome) {
        return itens.stream()
                .filter(p -> p.getNome().toLowerCase().contains(nome.toLowerCase()))
                .collect(Collectors.toList());
    }
}
