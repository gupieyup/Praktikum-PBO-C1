/**
 * Nama      : Gladys Paramadani Hersaputri
 * NIM       : 24060123140177
 * Tanggal   : 09 Mei 2025
 * File      : KoleksiAnabul.java
 * Deskripsi : konstruktor generic untuk objek-objek anabul
 */

import java.util.ArrayList;
import java.util.List;

public class KoleksiAnabul<T extends anabul> {
    private List<T> koleksi;
    
    public KoleksiAnabul() {
        this.koleksi = new ArrayList<>();
    }
    
    public void addAnabul(T anabul) {
        koleksi.add(anabul);
    }
    
    public void showAll() {
        for (int i = 0; i < koleksi.size(); i++) {
            T anabul = koleksi.get(i);
            System.out.println("Anabul-" + (i+1));
            System.out.println("Nama: " + anabul.getNama());
            anabul.gerak();
            anabul.suara();
            System.out.println();
        }
    }
    
    public int getJumlah() {
        return koleksi.size();
    }
}