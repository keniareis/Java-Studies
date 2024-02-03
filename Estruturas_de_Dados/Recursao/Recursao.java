package org.Learnig.Estruturas_de_Dados.Recursao;

public class Recursao {
    public static void main(String[] args){
        Recursiva(5);
    }
    public static int Recursiva(int i){
        System.out.println(i);
        if (i <= 1)
            return 0;
        else
            return Recursiva(i - 1);

    }
}
