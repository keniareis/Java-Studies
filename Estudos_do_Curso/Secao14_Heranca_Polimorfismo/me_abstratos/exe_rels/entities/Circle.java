package org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.me_abstratos.exe_rels.entities;

import org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.me_abstratos.exe_rels.entities.enums.Color;

public class Circle extends Shape{
    private Double radius;
    double PI = 3.141592653589;
    public Circle(){
        super();
    }
    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area() {
        return PI * Math.pow(radius, 2);
    }
}
