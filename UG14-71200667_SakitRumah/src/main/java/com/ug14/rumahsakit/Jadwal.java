package com.ug14.rumahsakit;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jadwal {
    private int idPemeriksaan;
    private Pasien pasien;
    private Dokter dokter;
    private Suster suster;
    private Pelayanan pelayanan;
    private boolean statusDaftar;
    private boolean statusScreening;

    public Jadwal(int idPemeriksaan, Pasien pasien, Dokter dokter, Suster suster, Pelayanan pelayanan){
        this.idPemeriksaan = idPemeriksaan;
        this.pasien = pasien;
        this.dokter = dokter;
        this.suster = suster;
        this.pelayanan = pelayanan;
        this.statusDaftar = true;
        this.statusScreening = true;
    }

    public boolean getStatusDaftar(){
        return this.statusDaftar;
    }

    public boolean getStatusScreening(){
        return this.statusScreening;
    }
}
