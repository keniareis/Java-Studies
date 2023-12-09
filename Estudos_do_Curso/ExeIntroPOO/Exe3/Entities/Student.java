package org.Learnig.Estudos_do_Curso.ExeIntroPOO.Exe3.Entities;

public class Student {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;
    public double min = 60.00;
    public double finalGrade(){
        return nota1 + nota2 + nota3;
    }

    public String toString(){
        if (finalGrade() >= min)
            return "PASS";
        else
            return "FAILED\nMISSING " + String.format("%.2f",(min - finalGrade())) + " POINTS";
    }
}
