/* Nama File    : AngkaSialException.java
 * Deskripsi    : Eksepsi buatan sendiri, menolak masukan angla 13!
 * Pembuat      : Gladys Paramadani Hersaputri / 24060123140177
 * Tanggal      : 07/03/2025
 */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }
        catch(AngkaSialException ase){
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka !!!");
        }
    }
}

// Pertanyaan : 
// 1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
// 2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi?

// Jawaban :
// 1. Jika angka bukan 13, maka akan dicetak dan kode lanjut ke baris berikutnya. Jika angka adalah 13, maka eksepsi dilempar sebelum mencapai baris 12, sehingga baris 12 tidak akan dieksekusi.
// 2. Baris 21 tidak akan dieksekusi, karena setelah as.cobaAngka(13) melempar eksepsi, program langsung masuk ke blok catch, melewati sisa kode dalam try.