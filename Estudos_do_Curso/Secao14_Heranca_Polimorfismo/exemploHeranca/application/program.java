package org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.exemploHeranca.application;

import org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.exemploHeranca.entities.Account;
import org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.exemploHeranca.entities.BusinessAcount;
import org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.exemploHeranca.entities.SavingsAccount;

public class program {
    public static void main(String[] args){

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAcount bacc = new BusinessAcount(1002, "Maria", 0.0, 500.00);

        //UpCasting
        Account acc1 = bacc;
        Account acc2 = new BusinessAcount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);


        //DownCasting
        BusinessAcount acc4 = (BusinessAcount) acc2;
        acc4.loan(100.0);

        //BusinessAcount acc5 = (BusinessAcount) acc3;
        if (acc3 instanceof BusinessAcount){
            BusinessAcount acc5 = (BusinessAcount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}
