/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author User
 */
public class OperasiSederhana {

    public static void penjumlahan(int a, int b) {
        System.out.println("Hasil penjumlahan: " + (a + b));
    }

    public static void pengurangan(int a, int b) {
        System.out.println("Hasil pengurangan: " + (a - b));
    }

    public static void perkalian(int a, int b) {
        System.out.println("Hasil perkalian: " + (a * b));
    }

    public static void pembagian(double a, double b) {
        if (b != 0) {
            System.out.println("Hasil pembagian: " + (a / b));
        } else {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
        }
    }

    public static void pangkat(int basis, int eksponen) {
        double hasil = Math.pow(basis, eksponen);
        System.out.println(basis + " pangkat " + eksponen + " = " + hasil);
    }
}
