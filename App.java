package com.ug3.soal1;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String nama, tanggal;
        int jumlah, berat;

        Scanner keyboard = new Scanner(System.in);

        System.out.println( "==========Data Project==========" );
        System.out.println("Masukan Data Product Makanan Anda");
        System.out.println("Nama makanan : ");
        nama = keyboard.nextLine();

        System.out.println("Tanggal kadaluarsa : ");
        tanggal = keyboard.nextLine();

        System.out.println("Jumlah (quantity) : ");
        jumlah = keyboard.nextInt();

        System.out.println("Berat (gram) : ");
        berat = keyboard.nextInt();

        System.out.println( "==========Data Project==========" );
        System.out.println("Masukan Data Product Makanan Anda");
        System.out.println("Nama makanan : " + nama);
        System.out.println("Tanggal kadaluarsa : " + tanggal);
        System.out.println("Jumlah (quantity) : " + jumlah);
        System.out.println("Berat (gram) : " + berat);

    }

}
