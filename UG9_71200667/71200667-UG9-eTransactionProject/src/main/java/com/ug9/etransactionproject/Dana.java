package com.ug9.etransactionproject;

public class Dana extends MobileWallet{
    public long danaFeeTransferBank;

    public Dana(String nama, long saldo, String noHp){
        super(nama, saldo, noHp);
    }

    public void transfer(DigitalPayment dp, long nominal){
        System.out.println("Akun Dana tidak valid");
    }
}
