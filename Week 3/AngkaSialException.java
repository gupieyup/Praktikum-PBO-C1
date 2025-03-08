/* Nama File    : AngkaSialException.java
 * Deskripsi    : Eksepsi buatan sendiri, menolak masukan angla 13!
 * Pembuat      : Gladys Paramadani Hersaputri / 24060123140177
 * Tanggal      : 07/03/2025
 */

public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}