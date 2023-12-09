package org.Learnig.Estudos_do_Curso.ExeIntroPOO.Exe1.Entities;

public class Medidas {
    public double width;
    public double height;

    public double area(){
        return width * height;
    }

    public double perimeter(){
        return (2 * width) + (2 * height);
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

}

