package org.Learnig.Logica.Manzano;

import java.awt.geom.QuadCurve2D;
import java.util.*;

public class Cap_06 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //--A--
        String[] nomes = new String[10];
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(nomes));


        //--B--
        int[] A = new int[8];
        int[] B = new int[8];
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
            B[i] = (A[i] * 3);
        }
        System.out.println(Arrays.toString(B));


        //--C--
        double[] A = new double[20];
        double[] B = new double[20];
        double[] C = new double[20];

        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextDouble() * 10;
            B[i] = random.nextDouble() * 10;
            C[i] = A[i] - B[i];
        }
        System.out.println(Arrays.toString(C));


        //--D--
        int[] A = new int[15];
        int[] B = new int[15];
        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt(10);
            B[i] = (int) Math.pow(A[i], 2);
        }
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));


        //--E--
        int[] A = new int[15];
        int[] B = new int[15];
        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt(10);
            B[i] = 1;
            for (int j = A[i]; j > 0 ; j--) {
                B[i] *= j;
            }
        }
        System.out.println(Arrays.toString(A));


        //--F--
        int[] A = new int[15];
        int[] B = new int[15];
        int[] C = new int[30];

        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt(15);
            B[i] = random.nextInt(15);
            for (int j = 0; j < A.length ; j++) {
                C[j] = A[j];
                C[j+14] = B[j];
            }
        }
        System.out.println(Arrays.toString(C));


        //--G--
        String[] A = new String[20];
        String[] B = new String[30];
        String[] C = new String[50];

        System.out.print("A = ");
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextLine();

        }

        System.out.print("B = ");
        for (int i = 0; i < B.length; i++) {
            B[i] = scanner.nextLine();
        }

        System.arraycopy(A, 0, C, 0, A.length);
        System.arraycopy(B, 0, C, A.length, B.length);

        for (String nome : C) {
            System.out.println(nome);
        }


        //--H--
        Double[] A = new Double[20];
        Double[] B = new Double[20];

        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextDouble(20);
        }
        System.out.println(Arrays.toString(A));

        Collections.reverse(Arrays.asList(A));
        System.arraycopy(A, 0, B, 0, A.length);

        System.out.println(Arrays.toString(B));


        //--I--
        Double[] A = new Double[5];
        Double[] B = new Double[5];
        Double[] C = new Double[5];
        Double[] D = new Double[15];

        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextDouble(10);
            B[i] = random.nextDouble(10);
            C[i] = random.nextDouble(10);
        }
        System.arraycopy(A, 0, D, 0, A.length);
        System.arraycopy(B, 0, D, 5, B.length);
        System.arraycopy(C, 0, D, 10, C.length);

        System.out.println(Arrays.toString(D));


        //--J--
        int[] A = new int[5];
        int[] B = new int[5];

        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt(10);

            for (int j = 0; j <= A[i]; j++) {
                B[i] += j;
            }
        }


        //--K--
        int[] A = new int[10];
        int[] B = new int[10];

        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt(10);
            B[i] = (A[i] * -1);
        }
        System.out.println(Arrays.toString(B));


        //--L--
        int[] A = new int[10];
        int[] B = new int[10];

        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt(10);
            B[i] = (A[i]/2);
        }
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));


        //--M--
        int[] A = new int[10];
        int valor = random.nextInt(10);

        for (int i = 0; i < A.length; i++) {
            A[i] = valor * (i+1);
        }
        System.out.println(Arrays.toString(A));


        //--N--
        Double[] A = new Double[20];
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextDouble();
        }

        double maior = A[0],menor = A[0],media = 0.0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > maior){
                maior = A[i];
            }
            if (A[i] < menor) {
                menor = A[i];
            }
            media += A[i];
        }
        System.out.println(Arrays.toString(A));
        System.out.println(maior + "\n" + menor + "\n" + (media/A.length));


        //--O--
        double[] A = new double[2];
        double[] B = new double[2];

        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextDouble();

            B[i] = A[i] * (9/5) + 32;
        }
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));


        //--P--
        int[] A = new int[12];
        int[] B = new int[12];

        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt(10);

            if (A[i] % 2 != 0){
                B[i] = A[i] * 2;
            }else {
                B[i] = A[i];
            }
        }
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));


        //--Q--
        double[] A = new double[15];
        double[] B = new double[15];

        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextDouble() * 10;

            if (A[i] % 2 == 0){
                B[i] = (A[i] / 2);
            }else {
                B[i] = A[i] * 1.5;
            }
        }
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));


        //--R--
        int[] A = new int[6];
        int[] B = new int[6];
        int[] C = new int[6];
        int[] D = new int[6];

        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt(10);
            B[i] = random.nextInt(10);

            if (i % 2 != 0){
                C[i] = A[i];
                D[i] = B[i];
            }else {
                C[i] = B[i];
                D[i] = A[i];
            }
        }

        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        System.out.println(Arrays.toString(C));
        System.out.println(Arrays.toString(D));



        //--S--
        int[] A = new int[6];
        int[] B = new int[6];
        int[] C = new int[12];

        int i = 0;
        while (i != 6) {
            System.out.print("A: ");
            int num = scanner.nextInt();
            if (num % 2 == 0){
                A[i] = num;
                i++;
            }else {
                System.out.println("Invalid");
            }
        }
        i = 0;
        while (i != 6) {
            System.out.print("B: ");
            int num = scanner.nextInt();
            if (num % 2 != 0){
                B[i] = num;
                i++;
            }else {
                System.out.println("Invalid");
            }
        }
        System.arraycopy(A, 0, C,0, A.length);
        System.arraycopy(B, 0, C,A.length, B.length);

        System.out.println(Arrays.toString(C));


        scanner.close();
    }
}
