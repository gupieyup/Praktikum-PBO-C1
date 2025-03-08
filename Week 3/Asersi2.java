/* Nama File    : Asersi2.java
 * Deskripsi    : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
 * Pembuat      : Gladys Paramadani Hersaputri / 24060123140177
 * Tanggal      : 07/03/2025
 */

// class Lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

// class Asersi 2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari > 0) : "jari jari tidak boleh nol !!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

// Pertanyaan :
// secara konsep, ada yang kurang tepat pada program Asersi2 di atas. Jelaskan!

// Jawaban : 
// Dalam program ini, asersi digunakan untuk memvalidasi input pengguna, yaitu nilai jariJari. Asersi tidak seharusnya digunakan untuk validasi input dari pengguna atau sumber eksternal, karena asersi bisa dinonaktifkan saat runtime.
// Jika asersi dinonaktifkan, kode akan tetap berjalan meskipun jariJari bernilai 0, yang bisa menyebabkan kesalahan perhitungan.