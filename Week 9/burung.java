/**
 * Nama      : Gladys Paramadani Hersaputri
 * NIM       : 24060123140177
 * Tanggal   : 09 Mei 2025
 * File      : burung.java
 * Deskripsi : implementasi burung sebagai anabul
 */

public class burung extends anabul {
    public burung(String nama){
        super(nama);
    }

    @Override
    public void gerak(){
        System.out.println("Bergerak dengan cara terbang");
    }

    public void suara(){
        System.out.println("Memiliki suara 'cuit'");
    }
}