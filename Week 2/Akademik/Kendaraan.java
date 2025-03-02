/* Nama File    : Kendaraan.java
 * Deskripsi    : berisi atribut dan method dalam class Kendaraan
 * Pembuat      : Gladys Paramadani Hersaputri / 24060123140177
 * Tanggal      : 26/02/2025
 */

public class Kendaraan {
    /********** ATRIBUT **********/
    private String noPlat;
    private String jenis;

    /********** METHOD **********/
    public Kendaraan(){
        this.noPlat = "";
        this.jenis = "";
    }

    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getNoPlat(){
        return this.noPlat;
    }

    public String getJenis(){
        return this.jenis;
    }

    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    public String toString() {
        return jenis + " - " + noPlat;
    }
}
