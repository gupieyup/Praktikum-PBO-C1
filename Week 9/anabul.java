/**
 * Nama      : Gladys Paramadani Hersaputri
 * NIM       : 24060123140177
 * Tanggal   : 09 Mei 2025
 * File      : anabul.java
 * Deskripsi : kelas konstruksi generic untuk anabul
 */

abstract class anabul {
    protected String nama;

    public anabul(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    
    public abstract void gerak();
    public abstract void suara();
}