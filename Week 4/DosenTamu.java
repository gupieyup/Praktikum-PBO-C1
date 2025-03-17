import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen {
    private String nidk;
    private LocalDate akhirKontrak;

    public DosenTamu(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidk, LocalDate akhirKontrak){
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.akhirKontrak = akhirKontrak;
    }

    public String getNidk(){
        return this.nidk;
    }

    public void setNidk(String nidk){
        this.nidk = nidk;
    }

    public LocalDate getAkhirKontrak(){
        return this.akhirKontrak;
    }

    public void setAkhirKontrak(LocalDate akhirKontrak){
        this.akhirKontrak = akhirKontrak;
    }

    public Period getMasaKontrak(){
        LocalDate today = LocalDate.now();
        return Period.between(today, akhirKontrak);
    }

    public void printMasaKontrak(){
        System.out.println("Masa Kontrak \t: " + getMasaKontrak().getYears() + " tahun " + getMasaKontrak().getMonths() + " bulan");
    }

    @Override
    public double getTunjangan() {
        return 0.025 * getGajiPokok();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK \t\t: " + getNidk());
        System.out.println("Jabatan \t: Dosen Tamu");
        System.out.println("Fakultas \t: " + getFakultas());
        printMasaKontrak();
        System.out.println("Kontrak Berakhir: " + formatTanggal(getAkhirKontrak()));
        System.out.println("Tunjangan \t: 2,5% x Rp " + String.format("%,.2f", getGajiPokok()) + 
                           " = Rp " + String.format("%,.2f", getTunjangan()));
    }
}
