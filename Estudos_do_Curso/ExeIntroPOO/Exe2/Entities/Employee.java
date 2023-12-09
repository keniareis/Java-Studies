package org.Learnig.Estudos_do_Curso.ExeIntroPOO.Exe2.Entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void icreaseSlary(double percetage){
        grossSalary += (percetage/100) * grossSalary;
    }
    public String toString(){
        return name + ", $ " + String.format("%.2f", netSalary());
    }

}
