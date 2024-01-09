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


        --G--
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

        scanner.close();
    }
}
