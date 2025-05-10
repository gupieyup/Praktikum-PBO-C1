/**
 * Nama      : Gladys Paramadani Hersaputri
 * NIM       : 24060123140177
 * Tanggal   : 09 Mei 2025
 * File      : MainKoleksi.java
 * Deskripsi : main class untuk koleksi berisi karakter
 */

public class MainKoleksi {
    public static void main(String[] args) {
        Koleksi<Character> koleksiChar = new Koleksi<>(10);
        
        koleksiChar.add('M');
        koleksiChar.add('A');
        koleksiChar.add('R');
        koleksiChar.add('K');
        koleksiChar.add('L');
        koleksiChar.add('E');
        koleksiChar.add('E');
        koleksiChar.add('N');
        koleksiChar.add('C');
        koleksiChar.add('T');
        
        System.out.println("Koleksi awal:");
        koleksiChar.showAll();
        
        System.out.println("\nElemen pada indeks 3: " + koleksiChar.getIsi(3));
        
        koleksiChar.setIsi(3, 'X');
        System.out.println("\nUpdate indeks 3:");
        koleksiChar.showAll();
        
        koleksiChar.delete(5);
        System.out.println("\nHapus indeks 5:");
        koleksiChar.showAll();
        
        koleksiChar.add('C');
        System.out.println("\nTambah Karakter 'D':");
        koleksiChar.showAll();
        
 
        koleksiChar.setSize(7);
        System.out.println("\nUpdate size menjadi 7:");
        koleksiChar.showAll();
    }
}