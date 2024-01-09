package org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.intro_poli.exe_fix.entities;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(){
        super();
    }
    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice(){
        return getPrice() + customsFee;
    }

    @Override
    public String priceTag() {
        return getName() + " $ "
                + String.format("%.2f",totalPrice())
                + " (Customs fee: $ " + String.format("%.2f",customsFee) + ")";
    }
}
