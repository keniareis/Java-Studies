package org.Learnig.ValidadorSenha.entities;

public class Validacao {
    private String senha;
    public static final String MAIUSCULAS = ".*[A-Z].*";
    public static final String MINUSCULAS = ".*[a-z].*";
    public static final String ESPECIAIS = ".*[.\\-\\[\\]*~_@#:?].*";
    public static final String NUMERO = ".*\\d.*";


    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String maiusculas(){
        if (!senha.matches(".*[A-Z].*")){
            return "A senha precisa ter pelo menos uma letra maiuscula!";
        }
        return null;
    }

    public String minusculas() {
        if (!senha.matches(".*[a-z].*")) {
            return "A senha precisa ter pelo menos uma letra minuscula!";
        }
        return null;
    }

    public String especiais() {
        if(!senha.matches(".*[.\\-\\[\\]*~_@#:?].*")) {
            return "A senha precisa ter pelo menos um caractere especial!";
        }
        return null;
    }

    public String numero() {
        if (!senha.matches(".*\\d.*")) {
            return "A senha precisa ter pelo menos um numero!";
        }
        return null;
    }

    public String tamanho() {
        if (senha.length() < 8) {
            return "Senha muito pequena";
        }
        return null;
    }
}
