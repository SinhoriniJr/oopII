package Generics.Exercicio08;

import java.util.List;
import java.util.stream.Collectors;

public class RepositorioCliente extends RepositorioMemoria<Cliente, Integer> {

    @Override
    public void salvar(Cliente cliente) {
        cliente.setId(proximoId++);
        super.salvar(cliente);
    }

    @Override
    public Cliente buscarPorId(Integer id) {
        return itens.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Método adicional para buscar clientes por nome (exemplo de método específico)
    public List<Cliente> buscarPorNome(String nome) {
        return itens.stream()
                .filter(c -> c.getNome().toLowerCase().contains(nome.toLowerCase()))
                .collect(Collectors.toList());
    }
}
