package com.ug13.rumahsakit;

public class Pasien {
    private String nama;
    private int usia;
    private String alamat;
    private String penyakit;
    private int levelPenyakit;
    private boolean status;

    public Pasien(String nama, int usia, String alamat, String penyakit) {
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
        this.penyakit = penyakit;
    }

    public Pasien(String nama, int usia, String alamat) {
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
        this.status = true;
    }

    public boolean getStatus(){
        return this.status;
    }

    public int getLevelPenyakit(){
        return  this.levelPenyakit;
    }
}