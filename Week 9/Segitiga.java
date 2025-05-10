/**
 * Nama      : Gladys Paramadani Hersaputri
 * NIM       : 24060123140177
 * Tanggal   : 09 Mei 2025
 * File      : Segitiga.java
 * Deskripsi : implementasi Segitiga sebagai BangunDatar
 */

public class Segitiga extends BangunDatar {
    private double sisi1;
    private double sisi2;
    private double sisi3;
    
    public Segitiga(double sisi1, double sisi2, double sisi3) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }
    
    public double hitungKeliling() {
        return sisi1 + sisi2 + sisi3;
    }

    public double hitungLuas() {
        double s = (sisi1 + sisi2 + sisi3) / 2;
        return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
    }
}