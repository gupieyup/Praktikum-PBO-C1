/**
 * Nama      : Gladys Paramadani Hersaputri
 * NIM       : 24060123140177
 * Tanggal   : 09 Mei 2025
 * File      : Persegi.java
 * Deskripsi : implementasi Persegi sebagai BangunDatar
 */

public class Persegi extends BangunDatar {
    private double sisi;
    
    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    
    public double hitungKeliling() {
        return 4 * sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }
}