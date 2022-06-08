package com.ug14.rumahsakit;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Pasien {
    private String url = "jdbc:sqlite:pasien.db";

    private String rm;
    private String nama;
    private int usia;
    private String alamat;
    private String penyakit;
    private int levelPenyakit;
    private boolean status;


    public void createDatabase(){
        try (Connection conn = DriverManager.getConnection(url)){
                DatabaseMetaData metaData = conn.getMetaData();
                System.out.println("Nama : " +metaData.getDriverName());

        }catch (SQLException e){
            throw new RuntimeException();
        }
    }

    public void createTable(){
        String createTable = "CREATE "
    }

    public Pasien(String rm, String nama, int usia, String alamat, String penyakit){
        this.rm = rm;
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
        this.penyakit = penyakit;
    }

    public Pasien(String rm, String nama, int usia, String alamat){
        this.rm = rm;
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
        this.status = true;
    }

    public boolean getStatus(){
        return this.status;
    }

    public int getLevelPenyakit(){
        return this.levelPenyakit;
    }

    public String getRm(){
        return this.rm;
    }
}
