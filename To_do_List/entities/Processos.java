package org.Learnig.To_do_List.entities;

import java.util.ArrayList;
import java.util.List;

public class Processos {
    private List<String> list = new ArrayList<>();

    public Processos() {
    }

    public List<String> getList() {
        return list;
    }

    public void adicionar(String tarefa){
        list.add(tarefa);
    }

    public void remover(int tarefa){
        list.remove(tarefa);
    }

    public String concluida(int tarefa){
        return list.get(tarefa) + "CONCLUIDA!";
    }
}
