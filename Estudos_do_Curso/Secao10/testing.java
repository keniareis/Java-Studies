package org.Learnig.Estudos_do_Curso.Secao10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class testing {
    public static void main(String[] args){

//        String[] vect = new String[]{"Maria", "Bob", "Alex"};
//
//        for (String obj: vect) {
//            System.out.println(obj);
//        }


        List<String> list = new ArrayList<>();


        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        System.out.println(list.size());


        for (String name: list) {
            System.out.println(name);
        }
        System.out.println("-------------------");
        list.removeIf(name -> name.charAt(0) == 'M');

        for (String name: list) {
            System.out.println(name);
        }

        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("-------------------");

        List<String> result = list.stream().filter(name -> name.charAt(0) == 'A').collect(Collectors.toList());

        for (String name: result) {
            System.out.println(name);
        }
        System.out.println("-------------------");

        String nome = list.stream().filter(name -> name.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(nome);
    }
}
