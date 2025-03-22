import java.text.DecimalFormat;
import java.time.LocalDate;

public abstract class Manusia {
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;
    
    public Manusia(){
        counterMns++;
    }

    public Manusia (String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public static int getCounterMns(){
        return counterMns;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public LocalDate getTgl_mulai_kerja(){
        return tgl_mulai_kerja;
    }

    public void setTgl_mulai_kerja(LocalDate tgl_mulai_kerja){
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public double getPendapatan(){
        return pendapatan;
    }

    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    public void printInfo(){
        System.out.println("Nama: " + getNama());
        System.out.println("Tanggal Mulai Kerja: " + getTgl_mulai_kerja());
        System.out.println("Alamat: " + getAlamat());
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println("Pendapatan: " + df.format(pendapatan));

    }

    public abstract int hitungMasaKerja();
}