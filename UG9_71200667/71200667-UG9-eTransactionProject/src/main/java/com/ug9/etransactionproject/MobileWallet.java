package com.ug9.etransactionproject;

public class MobileWallet extends DigitalPayment{
    private String noHp;
    private long feeTransferaBank;

    public MobileWallet(String nama, long saldo, String noHp){
        super(nama, saldo);
        this.noHp = noHp;
    }

    public String getNoHp(){
        return noHp;
    }

    public void setFeeTransferaBank(long nominal){
        this.feeTransferaBank = feeTransferaBank;
    }

    public void transfer(DigitalPayment dp, long nominal){
        if (dp instanceof BNImo){
            return printBuktiTransfer();
        } else if (setSaldo();){
            System.out.println("Transfer gagal! Saldo Anda tidak mencukupi.");
        }
    }
}
