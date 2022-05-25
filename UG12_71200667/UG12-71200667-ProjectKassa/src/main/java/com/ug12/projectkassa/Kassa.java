package com.ug12.projectkassa;

import java.util.ArrayList;
import java.util.HashMap;

public class Kassa {
    private HashMap<Produk, Integer> pesanan;
    private ArrayList<Kasir> arrKasir;
    private Kasir kasir;

    public void register(Kasir kasir){
        ArrayList<Kasir> arrKasir = new ArrayList<Kasir>();

    }

    public void login(String username, String password){
        boolean found = false;
        found = true;
        if(found){
            System.out.println(kasir + "Selamat Anda berhasil login.");
        }else{
            System.out.println("Username/password Anda salah.");
        }
    }

    public void tambahPesanan(Produk produk, int jumlah){
        /**HashMap<Produk, Integer> pesanan = new HashMap<>(Produk, Integer);
        pesanan.put(produk, jumlah);*/
    }

    public void printNota(){

    }

    public void printPenjualanKasir(){
        for(int jumlah = 0; jumlah < arrKasir.size(); jumlah++){
            arrKasir.get(jumlah);
        }
    }
}
