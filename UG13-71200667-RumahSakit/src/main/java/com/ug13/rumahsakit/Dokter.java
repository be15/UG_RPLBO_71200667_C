package com.ug13.rumahsakit;

public class Dokter {
    private String nama;
    private String spesialis;
    private String ruangan;

    public Dokter(String nama, String spesialis, String ruangan){
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public String getNama(){
        return this.nama;
    }

    public String getSpesialis(){
        return this.spesialis;
    }

    public String getRuangan(){
        return this.ruangan;
    }

    public void memeriksa(Pasien pasien, Jadwal jadwal){

    }

    public void cekStatus(Pasien pasien){
        if(pasien.getLevelPenyakit() > 0){
            System.out.println("========== PASIEN ANDA MASIH SAKIT ==========");
        }else {
            System.out.println("======== SELAMAT PASIEN ANDA SUDAH SEMBUH DAN SEHAT ==========");
        }
    }
}
