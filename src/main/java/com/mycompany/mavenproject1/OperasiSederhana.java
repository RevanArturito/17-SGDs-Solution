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

    public static int penjumlahan(int a, int b) {
        if (a < -50 || a > 50 || b < -50 || b > 50) {
            throw new IllegalArgumentException("Input di luar batas -50 hingga 50");
        }
        return a + b;
    }

    public static int pengurangan(int a, int b) {
        if (a < -50 || a > 50 || b < -50 || b > 50) {
            throw new IllegalArgumentException("Input di luar batas -50 hingga 50");
        }
        return a - b;
    }

    public static int perkalian(int a, int b) {
        if (a < -50 || a > 50 || b < -50 || b > 50) {
            throw new IllegalArgumentException("Input di luar batas -50 hingga 50");
        }
        return a * b;
    }

    public static double pembagian(double a, double b) {
        if (a < -50 || a > 50 || b < -50 || b > 50) {
            throw new IllegalArgumentException("Input di luar batas -50 hingga 50");
        }
        if (b == 0) {
            throw new ArithmeticException("Tidak bisa membagi dengan nol");
        }
        return (double) a / b;
    }

    public static double pangkat(int basis, int eksponen) {
        if (basis < -50 || basis > 50 || eksponen < -50 || eksponen > 50) {
            throw new IllegalArgumentException("Input di luar batas -50 hingga 50");
        }
        return Math.pow(basis, eksponen);
    }
}
