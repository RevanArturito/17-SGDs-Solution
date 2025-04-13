/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        System.out.println("---------------MENU--------------");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Cari nilai MAX");
        System.out.println("6. Cari nilai MIN");
        System.out.println("7. Cari bilangan ganjil");
        System.out.println("8. Cari bilangan genap");
        System.out.println("9. Bilangan pangkat");
        System.out.println("10. Cek positif negatif");
        System.out.print("Masukkan pilihan Anda: ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan bilangan pertama: ");
                int a1 = input.nextInt();
                System.out.print("Masukkan bilangan kedua: ");
                int b1 = input.nextInt();
                OperasiSederhana.penjumlahan(a1, b1);
                break;

            case 2:
                System.out.print("Masukkan bilangan pertama: ");
                int a2 = input.nextInt();
                System.out.print("Masukkan bilangan kedua: ");
                int b2 = input.nextInt();
                OperasiSederhana.pengurangan(a2, b2);
                break;

            case 3:
                System.out.print("Masukkan bilangan pertama: ");
                int a3 = input.nextInt();
                System.out.print("Masukkan bilangan kedua: ");
                int b3 = input.nextInt();
                OperasiSederhana.perkalian(a3, b3);
                break;

            case 4:
                System.out.print("Masukkan bilangan pertama: ");
                double a4 = input.nextDouble();
                System.out.print("Masukkan bilangan kedua: ");
                double b4 = input.nextDouble();
                OperasiSederhana.pembagian(a4, b4);
                break;

            case 5:
                System.out.print("Masukkan bilangan pertama: ");
                int a5 = input.nextInt();
                System.out.print("Masukkan bilangan kedua: ");
                int b5 = input.nextInt();
                CariNilai.cariMax(a5, b5);
                break;

            case 6:
                System.out.print("Masukkan bilangan pertama: ");
                int a6 = input.nextInt();
                System.out.print("Masukkan bilangan kedua: ");
                int b6 = input.nextInt();
                CariNilai.cariMin(a6, b6);
                break;

            case 7:
                System.out.print("Masukkan bilangan: ");
                int ganjil = input.nextInt();
                CariNilai.cekGanjil(ganjil);
                break;

            case 8:
                System.out.print("Masukkan bilangan: ");
                int genap = input.nextInt();
                CariNilai.cekGenap(genap);
                break;
            
            case 9:
                System.out.print("Masukkan bilangan basis: ");
                int a9 = input.nextInt();
                System.out.print("Masukkan bilangan eksponen: ");
                int b9 = input.nextInt();
                OperasiSederhana.pangkat(a9, b9);
                break;
            
            case 10:
                System.out.print("Masukkan bilangan: ");
                int a10 = input.nextInt();
                CariNilai.cekPositifNegatif(a10);
                break;

            default:
                System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}
