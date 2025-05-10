/**
 * Nama      : Gladys Paramadani Hersaputri
 * NIM       : 24060123140177
 * Tanggal   : 09 Mei 2025
 * File      : Koleksi.java
 * Deskripsi : program yang berisi elemen-elemen kelas koleksi
 */

import java.util.ArrayList;
import java.util.List;

public class Koleksi<T> {
    private int nbelm;        
    private List<T> wadah;
    
    public Koleksi(int kapasitas) {
        this.wadah = new ArrayList<>(kapasitas);
        this.nbelm = 0;
    }
    
    public T getIsi(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            return wadah.get(indeks);
        } 
        else {
            throw new IndexOutOfBoundsException("Indeks di luar batas koleksi");
        }
    }
    
    public void setIsi(int indeks, T nilai) {
        if (indeks >= 0 && indeks < nbelm) {
            wadah.set(indeks, nilai);
        } 
        else {
            throw new IndexOutOfBoundsException("Indeks di luar batas koleksi");
        }
    }
    
    public int getSize() {
        return nbelm;
    }
    
    public void setSize(int ukuran) {
        if (ukuran < 0 || ukuran > wadah.size()) {
            throw new IllegalArgumentException("Ukuran tidak valid");
        }
        this.nbelm = ukuran;
    }
    
    public void add(T nilai) {
        wadah.add(nilai);
        nbelm++;
    }
    
    public void delete(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            wadah.remove(indeks);
            nbelm--;
        } 
        else {
            throw new IndexOutOfBoundsException("Indeks di luar batas koleksi");
        }
    }
    
    public void showAll() {
        System.out.println("Jumlah elemen: " + nbelm + ":");
        for (int i = 0; i < nbelm; i++) {
            System.out.println("Elemen ke-" + (i + 1) + ": " + wadah.get(i));
        }
    }
}