package org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.exemplos.application;

import org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.exemplos.entities.Account;
import org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.exemplos.entities.BusinessAcount;
import org.Learnig.Estudos_do_Curso.Secao14_Heranca_Polimorfismo.exemplos.entities.SavingsAccount;

public class program {
    public static void main(String[] args){

        Account acc1 = new Account(1001, "Alex", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Bob", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAcount(1003, "Maria", 1000.0, 500.00);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
    }
}
