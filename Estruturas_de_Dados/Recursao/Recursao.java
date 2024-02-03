package org.Learnig.Estruturas_de_Dados.Recursao;

public class Recursao {
    public static void main(String[] args){
        Recursiva(5);
        System.out.println(fat(5));
    }
    public static int Recursiva(int i){
        System.out.println(i);
        if (i <= 1)
            return 0;
        else
            return Recursiva(i - 1);

    }
    public static int fat(int i){
        if (i == 1)
            return 1;
        else
            return i * fat(i - 1);
    }
}
