package Generics.Exercicio08;

import java.util.ArrayList;
import java.util.List;

public abstract class RepositorioMemoria<T, ID> implements Repositorio<T, ID> {
    protected List<T> itens = new ArrayList<>();
    protected int proximoId = 1;

    @Override
    public void salvar(T obj) {
        itens.add(obj);
    }

    @Override
    public List<T> listarTodos() {
        return new ArrayList<>(itens);
    }
}