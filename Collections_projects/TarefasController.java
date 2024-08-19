package org.Learnig.Collections_projects;

import org.Learnig.Collections_projects.Tarefa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TarefasController {

    // ArrayList é usado para permitir operações de adição, remoção e ordenação.
    private List<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada: " + tarefa);
    }

    public void removerTarefa(String nome) {
        boolean removed = tarefas.removeIf(tarefa -> tarefa.getNome().equals(nome));
        if (removed) {
            System.out.println("Tarefa removida");
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }

    public void listarTarefa() {
        System.out.println("\nLista de Tarefas: ");
        if (!tarefas.isEmpty()) {
            for (Tarefa tarefa : tarefas) {
                System.out.println(tarefa);
            }
        } else {
            System.out.print("\n! Nenhuma tarefa na lista !\n\n");
        }
    }

    public Tarefa buscarTarefa(String nome) {
        return tarefas.stream()
                .filter(tarefa -> tarefa.getNome().trim().equalsIgnoreCase(nome.trim()))
                .findFirst()
                .orElse(null);
    }

    public void atualizarTarefa(String nome, Tarefa.Status novoStatus) {
        Tarefa tarefa = buscarTarefa(nome);
        if (tarefa != null) {
            tarefa.setStatus(novoStatus);
            System.out.println("Tarefa atualizada: " + tarefa);
        } else {
            System.out.println("Essa tarefa não existe");
        }
    }

    public void ordenarPorPrioridade() {
        tarefas.sort(Comparator.comparingInt(Tarefa::getPrioridade).reversed());
        System.out.println("Tarefas ordenadas por prioridade.");
    }

    public void ordenarPorDataDeCriacao() {
        tarefas.sort(Comparator.comparing(Tarefa::getDataCriacao));
        System.out.println("Tarefas ordenadas por data de criação.");
    }
}
