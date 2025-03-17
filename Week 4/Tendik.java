import java.time.LocalDate;

public class Tendik extends Pegawai {
    private String bidang;
    private final int BUP = 55;
    
    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String bidang){
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public String getBidang(){
        return this.bidang;
    }

    public void setBidang(String bidang){
        this.bidang = bidang;
    }

    public LocalDate hitungBUP() {
        return getTanggalLahir().plusYears(BUP).withDayOfMonth(1).plusMonths(1);
    }

    @Override
    public double getTunjangan() {
        int tahunMasaKerja = getMasaKerja().getYears();
        return 0.01 * tahunMasaKerja * getGajiPokok();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan \t: Tenaga Kependidikan");
        System.out.println("Bidang \t\t: " + getBidang());
        printMasaKerja();
        System.out.println("BUP \t\t: " + formatTanggal(hitungBUP()));
        
        int tahunMasaKerja = getMasaKerja().getYears();
        System.out.println("Tunjangan \t: 1% x " + tahunMasaKerja + " x Rp " + String.format("%,.2f", getGajiPokok()) + 
                          " = Rp " + String.format("%,.2f", getTunjangan()));
    }
}
