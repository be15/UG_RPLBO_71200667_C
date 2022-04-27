package com.ug9.etransactionproject;

public class MobileBanking extends DigitalPayment{
    private boolean checkFee;
    private long feeAntarBank;
    private String noRekening;

    public MobileBanking(String nama, long saldo, String noRekening){
        super(nama, saldo);
        this.noRekening = noRekening;
    }

    public String getNoRekening(){
        return noRekening;
    }

    public void setCheckFee(boolean checkFee){
        this.checkFee = checkFee;
    }

    public boolean isCheckFee(){
        return checkFee;
    }

    public void transfer(DigitalPayment dp, long nominal){
        if (getSaldo('<0')){
            System.out.println("Nominal yang Anda input tidak valid!");
        }else if(getSaldo()){
            System.out.println("Transfer gagal! Saldo Anda tidak mencukupi.");
        }
    }
}
