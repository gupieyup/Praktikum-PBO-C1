/* Nama File    : MGaris.Java
 * Deskripsi    : berisi main dalam class Garis
 * Pembuat      : Gladys Paramadani Hersaputri / 24060123140177
 * Tanggal      : 20/02/2025
 */

public class MGaris {
    public static void main(String[] args){
        System.out.println("Garis G1: ");
        Garis G1 = new Garis();
        G1.setTitikAwal(new Titik(2,2));
        G1.setTitikAkhir(new Titik(5,5));
        G1.printGaris();
        System.out.println("Panjang Garis: " + G1.getPanjang());
        System.out.println("Gradien Garis: " + G1.getGradien());
        Titik T1 = G1.getTitikTengah();
        System.out.println("Titik Tengah Garis: ");
        T1.printTitik();
        System.out.print("Persamaan Garis: ");
        G1.printPersamaanGaris();
        System.out.println("");
        
        System.out.println("Garis G2: ");
        Garis G2 = new Garis(new Titik(6,6), new Titik(8,8));
        G2.printGaris();
        System.out.println("Panjang Garis: " + G2.getPanjang());
        System.out.println("Gradien Garis: " + G2.getGradien());
        Titik T2 = G2.getTitikTengah();
        System.out.println("Titik Tengah Garis: ");
        T2.printTitik();
        System.out.print("Persamaan Garis: ");
        G2.printPersamaanGaris();
        System.out.println("");
        
        System.out.println("Membandingkan Dua Garis: ");
        System.out.println("Apakah Dua Garis Sejajar? " + G1.isSejajar(G2));
        System.out.println("Apakah Dua Garis Tegak Lurus? " + G1.isTegakLurus(G2));
        System.out.println("");
        
        System.out.println("Jumlah Objek Garis: " + Garis.getCounterGaris());

    }
}
