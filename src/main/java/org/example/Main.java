//FANDY ROHMAN SIFA AMINULLOH
//202310370311241
package org.example;

import java.util.Scanner;
import java.time.Period;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("BIODATA MAHASISWA");

        String nama, jenis_kelamin,nim;

        Scanner objInput = new Scanner(System.in);

        System.out.print("Nama Mahasiswa: ");
        nama = objInput.nextLine();
        System.out.print("Jenis Kelamin (L/P): ");
        jenis_kelamin = objInput.nextLine();
        System.out.print("Masukkan NIM Anda : ");
        nim = objInput.nextLine();
        System.out.print("Masukkan tanggal lahir(yyyy-MM-dd): ");
        String tanggalLahirString = input.nextLine();
        LocalDate kelahiran = LocalDate.parse(tanggalLahirString);

        LocalDate saat_ini = LocalDate.now();
        Period periode = Period.between(kelahiran, saat_ini);
        int tahun = periode.getYears();
        int bulan = periode.getMonths();
        int hari = periode.getDays();

        System.out.println();
        System.out.println("Nama : " + nama );
        System.out.println("Jenis Kelamin :" + jenis_kelamin);
        System.out.println("Tanggal Lahir: " + tanggalLahirString);
        System.out.println("Umur: " + tahun + " tahun " + bulan + " bulan " + hari + " hari");
        System.out.println("NIM anda : " + nim);

    }
}