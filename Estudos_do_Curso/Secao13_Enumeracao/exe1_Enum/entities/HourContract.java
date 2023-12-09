package org.Learnig.Estudos_do_Curso.Secao13_Enumeracao.exe1_Enum.entities;

import java.util.Date;

// Classe que representa um contrato por hora
public class HourContract {
    // Atributos privados que representam a data, o valor por hora e a quantidade de horas do contrato
    private Date date;
    private Double valuePerHour;
    private Integer hours;

    // Construtor vazio da classe
    public HourContract(){
    }

    // Construtor que recebe e inicializa os atributos da classe
    public HourContract(Date date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    // Métodos getters e setters para acessar e modificar os atributos da classe

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    // Método para calcular o valor total do contrato multiplicando o valor por hora pelas horas trabalhadas
    public Double totalValue(){
        return valuePerHour * hours;
    }
}
