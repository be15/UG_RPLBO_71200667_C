package com.ug13.rumahsakit;

public class Jadwal {
    private Pasien pasien;
    private Dokter dokter;
    private Suster suster;
    private Pelayanan pelayanan;
    private boolean statusDaftar;
    private boolean statusScreening;

    public Jadwal(){
    }

    public Pasien getPasien(){
        return pasien;
    }
}
