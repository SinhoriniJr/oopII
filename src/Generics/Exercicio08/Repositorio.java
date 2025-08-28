package Generics.Exercicio08;

import java.util.List;

public interface Repositorio<T, ID> {
    void salvar(T obj);
    T buscarPorId(ID id);
    List<T> listarTodos();
}