/**
 * Nama      : Gladys Paramadani Hersaputri
 * NIM       : 24060123140177
 * Tanggal   : 07 Mei 2025
 * File      : BangunDatarGenericTest.java
 * Deskripsi : main class untuk generic bangun datar
 */

 public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(7);
        PersegiPanjang persegiPanjang = new PersegiPanjang(4, 5);
        Segitiga segitiga = new Segitiga(3, 4, 5);
        Persegi persegi = new Persegi(6);

        System.out.println("Nama : Gladys Paramadani Hersaputri");
        System.out.println("NIM  : 24060123140177");
        System.err.println("Lab  : PBO C1");
        System.out.println("\n");
        
        // Implementasi kelas Lingkaran
        BangunDatarGeneric<Lingkaran> bdgT1 = new BangunDatarGeneric<Lingkaran>();
        bdgT1.set(lingkaran);
        System.out.println("====== Lingkaran ==========");
        System.out.println("Keliling : " + bdgT1.hitungKeliling());
        System.out.println("Luas     : " + bdgT1.hitungLuas());
        System.out.println("Tipe     : " + bdgT1.get().getClass().getName());
        System.out.println("\n");
        
        // Implementasi kelas PersegiPanjang
        BangunDatarGeneric<PersegiPanjang> bdgT2 = new BangunDatarGeneric<PersegiPanjang>();
        bdgT2.set(persegiPanjang);
        System.out.println("===== PersegiPanjang =====");
        System.out.println("Keliling : " + bdgT2.hitungKeliling());
        System.out.println("Luas     : " + bdgT2.hitungLuas());
        System.out.println("Tipe     : " + bdgT2.get().getClass().getName());
        System.out.println("\n");
        
        // Impelentasi kelas Segitiga
        BangunDatarGeneric<Segitiga> bdgT3 = new BangunDatarGeneric<Segitiga>();
        bdgT3.set(segitiga);
        System.out.println("===== Segitiga ===========");
        System.out.println("Keliling : " + bdgT3.hitungKeliling());
        System.out.println("Luas     : " + bdgT3.hitungLuas());
        System.out.println("Tipe     : " + bdgT3.get().getClass().getName());
        System.out.println("\n");
        
        // Implementasi kelas Persegi
        BangunDatarGeneric<Persegi> bdgT4 = new BangunDatarGeneric<Persegi>();
        bdgT4.set(persegi);
        System.out.println("===== Persegi ============");
        System.out.println("Keliling : " + bdgT4.hitungKeliling());
        System.out.println("Luas     : " + bdgT4.hitungLuas());
        System.out.println("Tipe     : " + bdgT4.get().getClass().getName());
    }
}
