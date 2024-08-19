package org.Learnig.Collections_projects;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TarefasController controller = new TarefasController();

        while (true) {
            System.out.println("---TAREFAS---");
            System.out.println("\n[1] - Ver Tarefas");
            System.out.println("[2] - Adicionar Tarefa");
            System.out.println("[3] - Remover Tarefa");
            System.out.println("[4] - Atualizar Tarefa");
            System.out.println("[5] - Buscar Tarefa");
            System.out.println("[6] - Ordenar por prioridade");
            System.out.println("[7] - Ordenar por data de criacao");
            System.out.println("[0] - SAIR");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    controller.listarTarefa();
                    break;

                case 2:
                    System.out.println("--- Nova Tarefa ---");

                    System.out.print("Nome da tarefa: ");
                    String nome = scanner.nextLine();
                    System.out.print("Descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Prioridade (número inteiro): ");
                    int prioridade = scanner.nextInt();

                    System.out.println("Escolha o status da tarefa:");
                    for (Tarefa.Status status : Tarefa.Status.values()) {
                        System.out.println((status.ordinal() + 1) + ". " + status.name());
                    }

                    int statusChoice = scanner.nextInt();
                    Tarefa.Status statusSelecionado = Tarefa.Status.values()[statusChoice - 1];

                    Tarefa tarefa = new Tarefa(nome, descricao, prioridade, statusSelecionado);
                    controller.adicionarTarefa(tarefa);
                    break;

                case 3:
                    System.out.print("Digite o nome da tarefa que você quer remover: ");
                    String nomeTarefa = scanner.nextLine();
                    controller.removerTarefa(nomeTarefa);
                    break;

                case 4:
                    System.out.print("Nome da tarefa que você quer atualizar: ");
                    String nomeTarefaUpdate = scanner.nextLine();

                    tarefa = controller.buscarTarefa(nomeTarefaUpdate);
                    if (tarefa != null) {
                        System.out.println("Escolha o novo status da tarefa:");
                        for (Tarefa.Status status : Tarefa.Status.values()) {
                            System.out.println((status.ordinal() + 1) + ". " + status.name());
                        }

                        statusChoice = scanner.nextInt();
                        statusSelecionado = Tarefa.Status.values()[statusChoice - 1];
                        controller.atualizarTarefa(nomeTarefaUpdate, statusSelecionado);
                    } else {
                        System.out.println("Tarefa não encontrada.");
                    }
                    break;

                case 5:
                    System.out.print("Digite o nome da tarefa que você deseja buscar: ");
                    String nomeBusca = scanner.nextLine();
                    Tarefa tarefaEncontrada = controller.buscarTarefa(nomeBusca);
                    if (tarefaEncontrada != null) {
                        System.out.println("Tarefa encontrada: " + tarefaEncontrada);
                    } else {
                        System.out.println("Tarefa não encontrada.");
                    }
                    break;

                case 6:
                    controller.ordenarPorPrioridade();
                    controller.listarTarefa();
                    break;

                case 7:
                    controller.ordenarPorDataDeCriacao();
                    controller.listarTarefa();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        }

    }
}