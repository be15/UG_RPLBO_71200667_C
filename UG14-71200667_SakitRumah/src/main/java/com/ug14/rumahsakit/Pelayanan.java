package com.ug14.rumahsakit;

import java.util.Scanner;

public class Pelayanan {
    private int idPelayan;
    private String nama;

    public void mengaturJadwal(Pasien pasien, Dokter dokter, Jadwal jadwal){

    }

    public Pasien registrasi(){
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Masukkan Nama Anda: ");
        String nama = inputUser.nextLine();

        System.out.println("Masukkan Usia Anda: ");
        int usia = inputUser.nextInt();

        System.out.println("Masukkan Alamat Anda: ");
        String alamat = inputUser.next();

        System.out.println("Masukkan Penyakit Anda: ");
        String penyakit = inputUser.next();

        return new Pasien(nama, usia, alamat, penyakit);
    }
}
