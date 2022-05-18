package com.ug11.kalkulasirupiah;

import java.util.Scanner;
import java.util.Stack;

public class App 
{
    public static void main( String[] args )
    {
        Stack angka = new Stack();
        String teks;
        String biaya ="";

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan teks: ");
        teks = input.nextLine();

        int a = teks.length();
        for(int i=a-1; i>=0; i--){
            if(teks.charAt(i) >='0'&& teks.charAt(i) <='9')
                biaya += angka.push(teks.charAt(i));
        }
        System.out.println("Rincian biaya: "+biaya);

        System.out.println("Total: "+biaya);
    }
}
