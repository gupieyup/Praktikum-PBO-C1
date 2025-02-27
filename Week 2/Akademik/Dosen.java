/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Gladys Paramadani Hersaputri / 24060123140177
 * Tanggal      : 26/02/2025
 */

public class Dosen {
    /********** ATRIBUT **********/
    private String nip;
    private String nama;
    private String prodi;

    /********** METHOD **********/
    public Dosen(){
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNip(){
        return this.nip;
    }

    public String getNama(){
        return this.nama;
    }

    public String getProdi(){
        return this.prodi;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }
}
