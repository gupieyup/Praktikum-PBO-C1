/* Nama File    : MataKuliah.java
 * Deskripsi    : berisi atribut dan method dalam class MataKuliah
 * Pembuat      : Gladys Paramadani Hersaputri / 24060123140177
 * Tanggal      : 26/02/2025
 */

 public class MataKuliah {
    /********** ATRIBUT **********/
    private String idMatkul;
    private String nama;
    private int sks;

    /********** METHOD **********/
    public MataKuliah(){
        this.idMatkul = "";
        this.nama = "";
        this.sks = 0;
    }

    public MataKuliah(String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getIdMatkul(){
        return this.idMatkul;
    }

    public String getNama(){
        return this.nama;
    }

    public int getSks(){
        return this.sks;
    }

    public void setIdMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSks(int sks){
        this.sks = sks;
    }
}
