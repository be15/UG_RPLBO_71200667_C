package com.ug13.rumahsakit;

import java.util.Scanner;

public class Pelayanan {
    private String nama;

    public Pelayanan(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return this.nama;
    }

    public void mengaturJadwal(Pasien pasien, Dokter dokter, Jadwal jadwal){

    }

    public  registrasi(){
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Masukkan Nama Anda: ");
        String nama = inputUser.nextLine();

        System.out.println("Masukkan Usia Anda: ");
        int usia = inputUser.nextLine();

        return new Pasien(nama, usia);
    }
}
