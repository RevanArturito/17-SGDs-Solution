/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author User
 */
public class CariNilai {

    public static void cariMax(int a, int b) {
        if (a < -50 || a > 50 || b < -50 || b > 50) {
            throw new IllegalArgumentException("Input di luar batas -50 hingga 50");
        }
        System.out.println("Nilai MAX: " + Math.max(a, b));
    }

    public static void cariMin(int a, int b) {
        if (a < -50 || a > 50 || b < -50 || b > 50) {
            throw new IllegalArgumentException("Input di luar batas -50 hingga 50");
        }
        System.out.println("Nilai MIN: " + Math.min(a, b));
    }

    public static void cekGanjil(int angka) {
        if (angka < -50 || angka > 50) {
            throw new IllegalArgumentException("Input di luar batas -50 hingga 50");
        }
        if (angka % 2 != 0) {
            System.out.println(angka + " adalah bilangan ganjil.");
        } else {
            System.out.println(angka + " bukan bilangan ganjil.");
        }
    }

    public static void cekGenap(int angka) {
        if (angka < -50 || angka > 50) {
            throw new IllegalArgumentException("Input di luar batas -50 hingga 50");
        }
        if (angka % 2 == 0) {
            System.out.println(angka + " adalah bilangan genap.");
        } else {
            System.out.println(angka + " bukan bilangan genap.");
        }
    }

    public static void cekPositifNegatif(int angka) {
        if (angka < -50 || angka > 50) {
            throw new IllegalArgumentException("Input di luar batas -50 hingga 50");
        }
        if (angka > 0) {
            System.out.println(angka + " adalah bilangan positif.");
        } else if (angka < 0) {
            System.out.println(angka + " adalah bilangan negatif.");
        } else {
            System.out.println("Angka adalah nol.");
        }
    }
}
