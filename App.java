package com.ug3.soal2;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        String pertama, kedua;

        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Bilangan Fibonacci dari kata" );
        System.out.println( "Masukan input pertama: " );
        pertama = keyboard.next();

        System.out.println( "Masukan input kedua: " );
        kedua = keyboard.next();

        System.out.println( "Bilangan Fibonacci dari kata" );
        System.out.println( "Masukan input pertama: " + pertama);
        System.out.println( "Masukan input kedua: " + kedua);



    }


}
