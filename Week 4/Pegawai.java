import java.time.LocalDate;
import java.time.Period;

public class Pegawai {
    private String nip;
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate tmt;
    private double gajiPokok;

    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public String getNip(){
        return this.nip;
    }

    public void setNip(String nip){
        this.nip = nip;
    } 

    public String getNama(){
        return this.nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    } 

    public LocalDate getTanggalLahir(){
        return this.tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    public LocalDate getTmt(){
        return this.tmt;
    }

    public void setTmt(LocalDate tmt){
        this.tmt = tmt;
    }

    public double getGajiPokok(){
        return this.gajiPokok;
    }

    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public Period getMasaKerja() {
        LocalDate today = LocalDate.now();
        return Period.between(getTmt(), today);
    }
  
    public void printMasaKerja() {
        System.out.println("Masa Kerja \t: " + getMasaKerja().getYears() + " tahun " + getMasaKerja().getMonths() + " bulan");
    }
   
    public double getTunjangan() {
        return 0.0;
    }

    public void printInfo() {
        System.out.println("NIP \t\t: " + getNip()); 
        System.out.println("Nama \t\t: " + getNama());
        System.out.println("Tanggal Lahir \t: " + formatTanggal(getTanggalLahir()));
        System.out.println("TMT \t\t: " + formatTanggal(getTmt()));
        System.out.println("Gaji Pokok \t: Rp " + String.format("%,.2f", getGajiPokok()));
    }

    protected String formatTanggal(LocalDate date) {
        java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("d MMM yyyy");
        return date.format(formatter);
    }
}
