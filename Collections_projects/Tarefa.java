package org.Learnig.Collections_projects;

import java.util.Date;

public class Tarefa {
    private String nome;
    private String descricao;
    private Date dataCriacao;
    private int prioridade;
    private Status status;

    public Tarefa() {
    }

    public Tarefa(String nome, String descricao, int prioridade, Status status) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataCriacao = new Date();
        this.prioridade = prioridade;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Status getStatus() {
        return status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }



    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString(){
        return nome + ". " + descricao + "\n" +
                "Prioridade: " + prioridade + " | Status: " + status +
                " | Data de Criação: " + dataCriacao;
    }

    public int compareTo(Tarefa outraTarefa){
        return this.dataCriacao.compareTo(outraTarefa.dataCriacao);
    }

    public enum Status{
        PENDENTE, EM_PROGRESSO, CONCLUIDA
    }
}
