package org.Learnig.Estudos_do_Curso.Secao13_Enumeracao.exe1_Enum.entities;

import org.Learnig.Estudos_do_Curso.Secao13_Enumeracao.exe1_Enum.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

// Classe que representa um trabalhador
public class Worker {
    // Atributos privados que representam o nome, nível, salário base, departamento e lista de contratos do trabalhador
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Departament departament;
    private List<HourContract> contracts = new ArrayList<>(); // Lista de contratos

    // Construtor vazio da classe
    public Worker(){
    }

    // Construtor que recebe e inicializa os atributos da classe
    public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    // Métodos getters e setters para acessar e modificar os atributos da classe

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    // Método para adicionar um contrato à lista de contratos do trabalhador
    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    // Método para remover um contrato da lista de contratos do trabalhador
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    // Método para calcular o rendimento do trabalhador em um determinado ano e mês
    public Double income(int year, int month){
        double soma = baseSalary; // Inicializa a variável 'soma' com o salário base do trabalhador
        Calendar cal = Calendar.getInstance(); // Cria uma instância de Calendar para manipular datas

        for (HourContract c : contracts){ // Itera sobre os contratos do trabalhador
            cal.setTime(c.getDate()); // Define a data do contrato atual no Calendar
            int c_year = cal.get(Calendar.YEAR); // Obtém o ano do contrato
            int c_month = 1 + cal.get(Calendar.MONTH); // Obtém o mês do contrato

            if (year == c_year && month == c_month){ // Verifica se o contrato está no ano e mês desejados
                soma += c.totalValue(); // Adiciona ao 'soma' o valor do contrato
            }
        }
        return soma; // Retorna o valor total do rendimento do trabalhador para o mês e ano específicos
    }
}
