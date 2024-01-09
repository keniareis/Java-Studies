package org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.intro_poli.exe_fix.entities;

public class Product {
    private String name;
    private Double price;

    public Product(){
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(name + " $ " + String.format("%.2f",price));
        return sb.toString();
    }
}
