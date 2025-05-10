/**
 * Nama      : Gladys Paramadani Hersaputri
 * NIM       : 24060123140177
 * Tanggal   : 07 Mei 2025
 * File : BangunDatarGeneric.java
 * Deskripsi : kelas konstruksi generic untuk BangunDatar
 */

 public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T get() {
        return bangunDatar;
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }

    public double hitungLuas() {
        return bangunDatar.hitungLuas();
    }
}