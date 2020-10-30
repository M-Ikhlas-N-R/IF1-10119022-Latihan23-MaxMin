package com.latihan;

import java.util.Scanner;
import java.util.ArrayList;

/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : Program mencari max dan min Latihan 23
 *
 */

public class MaxMin {
    public static void main(String[] args) {
        // Deklarasi Variabel
        int banyakMhs, max = 0, min = 100, j = 1, nilai;
        ArrayList nilaiMhs = new ArrayList();

        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        // Input section
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        String namaPetugas = keyboard.nextLine();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        banyakMhs = keyboard.nextInt();

        for (int i = 0; i < banyakMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + j + " = ");
            nilai = keyboard.nextInt();
            nilaiMhs.add(nilai);
            if (nilai > max) max = nilai;
            if (nilai < min) min = nilai;
            j++;
        }

        // Output section
        j = 1;
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        for (int i = 0; i < banyakMhs; i++) {
            System.out.println("Nilai mahasiswa ke-" + j + " = " + nilaiMhs.get(i));
            j++;
        }

        System.out.println("\nNilai Terbesar adalah " + max);
        System.out.println("Nilai Terkecil adalah " + min);
        System.out.println("\nPetugas : " + namaPetugas);

    }
}
