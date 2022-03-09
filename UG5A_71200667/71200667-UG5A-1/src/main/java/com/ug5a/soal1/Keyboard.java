package com.ug5a.soal1;

public class Keyboard {
    private String merkModel;
    private Long harga;

    public void setMerkModel(String merkModel) {
        this.merkModel = merkModel;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }

    public String getMerkModel(){
        return merkModel;
    }

    public Long getHarga(){
        return harga;
    }
}