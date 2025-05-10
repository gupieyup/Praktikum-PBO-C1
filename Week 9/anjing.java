/**
 * Nama      : Gladys Paramadani Hersaputri
 * NIM       : 24060123140177
 * Tanggal   : 09 Mei 2025
 * File      : anjing.java
 * Deskripsi : implementasi anjing sebagai anabul
 */

public class anjing extends anabul {
    public anjing(String nama){
        super(nama);
    }

    @Override 
    public void gerak(){
        System.out.println("Bergerak dengan cara melata");
    }

    public void suara(){
        System.out.println("Memiliki suara 'guk-guk'");
    }
}
