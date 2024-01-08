package org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.intro_poli.exe_resl.entities;

public class OutsourcedEmployee extends Employee{

    private Double additionalCharge;

    public OutsourcedEmployee() {
        super();
    }
    public OutsourcedEmployee(String name, Integer hours, Double valuePerHours, Double additionalCharge){
        super(name, hours, valuePerHours);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment() {
        return super.payment() + additionalCharge * 1.1;
    }
}
