package org.Learnig.To_do_List.application;

import org.Learnig.To_do_List.entities.Processos;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Processos processos = new Processos();

        System.out.println("=== TO-DO ===");

        //try {
            System.out.println("[1]Adiconar tarefa\n[2]Remover tarefa\n[3]Marcar como concluída\n[0]Sair");
            int escolha = scanner.nextInt();

            while (escolha != 0) {
                if (processos.getList().size() == 0) {
                    System.out.println("LISTA VAZIA");
                    System.out.println("Sem tarefas para fazer");
                } else {
                    System.out.printf("%d tarefas a fazer\n", processos.getList().size());
                    for (int i = 0; i < processos.getList().size(); i++) {
                        System.out.println((i + 1) + "°" + processos.getList().get(i));
                    }
                }


                switch (escolha) {
                    case 1:
                        System.out.print("Digite a tarefa: ");
                        String tarefa = scanner.nextLine();
                        processos.adicionar(tarefa);
                        break;

                    case 2:
                        System.out.print("Qual tarefa retirar: ");
                        int retirar = scanner.nextInt();
                        processos.remover(retirar);
                        break;

                    case 3:
                        System.out.print("Qual tarefa voce terminou: ");
                        int concluido = scanner.nextInt();
                        processos.concluida(concluido);
                        break;

                }
            }
       // }

        scanner.close();
    }
}
