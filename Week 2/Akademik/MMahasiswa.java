/* Nama File    : MMahasiswa.java
 * Deskripsi    : berisi main dalam class Mahasiswa
 * Pembuat      : Gladys Paramadani Hersaputri / 24060123140177
 * Tanggal      : 20/02/2025
 */

public class MMahasiswa{
    public static void main(String[] args){
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Mahasiswa Glad = new Mahasiswa("177","Glad","Informatics");
        Dosen Sunan = new Dosen("099","Sunan","Sistem Informasi");
        Kendaraan Mobil1 = new Kendaraan("G 14 D","mobil");
        Glad.setDosenWali(Sunan);
        Glad.setKendaraan(Mobil1);
        Glad.addMatkul(MBD);
        Glad.addMatkul(PBO);
        Glad.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah: " + Glad.getJumlahMatKul());
        System.out.println("Jumlah SKS: " + Glad.getJumlahSks());
    }
}