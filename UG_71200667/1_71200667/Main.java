import java.util.Scanner;
public class Main {

    public static void main(String args[]){
        mobil M_71200667 = new mobil();
        PejalanKaki P_71200667 = new PejalanKaki();
        Scanner inp = new Scanner(System.in);
        System.out.println("Kode lampu lalu lintas saat ini: ");
        int kodeLampu = inp.nextInt();
        if (kodeLampu = 1 ){
            System.out.println("--- Lampu Hijau ---");
            System.out.println("Mobil M_71200667 jalan");
            System.out.println("P_71200667 menunggu");
        } else if (kodeLampu = 2) {
            System.out.println("--- Lampu Kuning ---");
            System.out.println("Mobil M_71200667 kurangi kecepatan");
            System.out.println("P_71200667 bersiap untuk menyebrang jalan");
        } else if (kodeLampu = 3) {
            System.out.println("--- Lampu Merah ---");
            System.out.println("Mobil M_71200667 stop");
            System.out.println("P_71200667 menyebrangi jalan");
        }



    }
}
