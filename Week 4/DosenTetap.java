import java.time.LocalDate;

public class DosenTetap extends Dosen {
    private String nidn;
    private final int BUP = 65;

    public DosenTetap(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidn){
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public String getNidn(){
        return this.nidn;
    }

    public void setNidn(String nidn){
        this.nidn = nidn;
    }

    public LocalDate hitungBUP(){
        return getTanggalLahir().plusYears(BUP).withDayOfMonth(1).plusMonths(1);
    }

    @Override
    public double getTunjangan() {
        int tahunMasaKerja = getMasaKerja().getYears();
        return 0.02 * tahunMasaKerja * getGajiPokok();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDN \t\t: " + getNidn());
        System.out.println("Jabatan \t: Dosen Tetap");
        System.out.println("Fakultas \t: " + getFakultas());
        printMasaKerja();
        System.out.println("BUP \t\t: " + formatTanggal(hitungBUP()));
        
        int tahunMasaKerja = getMasaKerja().getYears();
        System.out.println("Tunjangan \t: 2% x " + tahunMasaKerja + " x Rp " + String.format("%,.2f", getGajiPokok()) + 
                           " = Rp " + String.format("%,.2f", getTunjangan()));
    }
}
