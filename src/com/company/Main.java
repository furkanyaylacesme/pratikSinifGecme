package com.company;

import java.util.Scanner;

public class Main {

    private static int genelOrt = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mat, fizik, kimya, turkce, muzik;

        System.out.println("Matematik Notunu Giriniz : ");
        mat = scanner.nextInt();
        checkNotAndSum(mat);

        System.out.println("Fizik Notunu Giriniz : ");
        fizik = scanner.nextInt();
        checkNotAndSum(fizik);

        System.out.println("Kimya Notunu Giriniz : ");
        kimya = scanner.nextInt();
        checkNotAndSum(kimya);

        System.out.println("Türkçe Notunu Giriniz : ");
        turkce = scanner.nextInt();
        checkNotAndSum(turkce);

        System.out.println("Müzik Notunu Giriniz : ");
        muzik = scanner.nextInt();
        checkNotAndSum(muzik);

        double avarage = genelOrt / 5;

        if (avarage <= 55) {
            System.out.println("Sınıfta kaldiniz");
        } else {
            System.out.println("Tebrikler.");
        }
        System.out.println("Ortalamanız : " + avarage);

    }

    public static void checkNotAndSum(int not){
        if (not <= 100 && not >= 0){
            genelOrt += not;
        }
    }
}
