package org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.me_abstratos.exe_rels.entities;

import org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.me_abstratos.exe_rels.entities.enums.Color;

public abstract class Shape {

    private Color color;

    public Shape() {
    }
    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Double area(Double base, Double altura){
        return base * altura;
    }

    public abstract Double area();
}
