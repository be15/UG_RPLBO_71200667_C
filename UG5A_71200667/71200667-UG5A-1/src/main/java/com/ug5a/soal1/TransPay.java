package com.ug5a.soal1;

import java.security.Key;

public class TransPay {
    private String nama;
    private long saldo;

    public void setNama(String name) {
        nama = name;
    }

    public void setSaldo(long saldoBaru) {
        saldo = saldoBaru;
    }

    public void topUp(long saldoBaru){
        if (saldoBaru > 0){
            saldo += saldoBaru;
            System.out.println("Top up sebesar Rp "+saldoBaru+ "berhasil");
        }else{
            System.out.println("Nominal Anda tidak valid! Nominal harus lebih dari 0");
        }
    }

    public String getNama(){
        return nama;
    }

    public long getSaldo() {
        return saldo;
    }

    public void bayar(int jumlah, Keyboard k){
        if (jumlah > 0) {
            if (saldo > jumlah * k.getHarga()) {
                System.out.println("Pembayaran sukses! Silakan mengambil " + k.getMerkModel() + "di counter");
                saldo = saldo - (jumlah * k.getHarga());
            } else {
                System.out.println("Pembayaran gagal! Saldo Anda kurang, silakan melakukan top up!");
            }
        }else{
            System.out.println("Input jumlah tidak valid!");
        }
    }
}