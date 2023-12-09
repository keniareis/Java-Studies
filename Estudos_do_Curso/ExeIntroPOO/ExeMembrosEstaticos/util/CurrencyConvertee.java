package org.Learnig.Estudos_do_Curso.ExeIntroPOO.ExeMembrosEstaticos.util;

public class CurrencyConvertee {
    public static final double IOF = 6/100d;
    public static double cotacao;
    public static double valorDolar;

    public static String converter(){
        return String.format("%.2f", (cotacao * valorDolar + (valorDolar * IOF)));
    }
}
