package org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.me_abstratos.exe_fix.entities;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double anuallncome, Double healthExpenditures) {
        super(name, anuallncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }


    @Override
    public Double tax() {
        if (getAnuallncome() < 20.000) {
            return (getAnuallncome() * 0.15) - (healthExpenditures * 0.5);
        }else{
            return (getAnuallncome() * 0.25) - (healthExpenditures * 0.5);
        }
    }
}