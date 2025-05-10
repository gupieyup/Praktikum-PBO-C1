/**
 * Nama      : Gladys Paramadani Hersaputri
 * NIM       : 24060123140177
 * Tanggal   : 09 Mei 2025
 * File      : kucing.java
 * Deskripsi : implementasi kucing sebagai anabul
 */

public class kucing extends anabul {
    public kucing(String nama){
        super(nama);
    }

    @Override
    public void gerak(){
        System.out.println("Bergerak dengan cara melata");
    }

    public void suara(){
        System.out.println("Memiliki suara 'meong'");
    }
}