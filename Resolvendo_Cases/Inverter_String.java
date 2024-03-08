package org.Learnig.Resolvendo_Cases;

public class Inverter_String {
    public static void main(String[] args){
        String palavras = "hello, wolrd!";
        String invertida = invereterString(palavras);
        System.out.println(invertida);
    }
    public static String invereterString(String palavras){
        StringBuilder invertida = new StringBuilder();
        for (int i = palavras.length() - 1; i >= 0; i--){
            invertida.append(palavras.charAt(i));
        }
        return invertida.toString();
    }
}
