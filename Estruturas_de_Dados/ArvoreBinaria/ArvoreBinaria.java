package org.Learnig.Estruturas_de_Dados.ArvoreBinaria;

public class ArvoreBinaria {
    public static void main(String[] args){
        Arvore<Integer> arvore = new Arvore<Integer>();
        arvore.adicionar(10);
        arvore.adicionar(8);
        arvore.adicionar(5);
        arvore.adicionar(9);
        arvore.adicionar(7);
        arvore.adicionar(18);
        arvore.adicionar(13);
        arvore.adicionar(20);
        System.out.println("\n\nEm-Ordem");
        arvore.emOrdem(arvore.getRaiz());

        System.out.println("\n\nPré-Ordem");
        arvore.preOrdem(arvore.getRaiz());

        System.out.println("\n\nPós-Ordem");
        arvore.posOrdem(arvore.getRaiz());
    }
}
