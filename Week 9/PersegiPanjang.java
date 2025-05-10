/**
 * Nama      : Gladys Paramadani Hersaputri
 * NIM       : 24060123140177
 * Tanggal   : 09 Mei 2025
 * File      : PersegiPanjang.java
 * Deskripsi : implementasi Persegi Panjang sebagai BangunDatar
 */

public class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;
    
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public double hitungLuas() {
        return panjang * lebar;
    }
}