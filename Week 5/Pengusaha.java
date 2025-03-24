import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(){
        counterPengusaha++;
    }

    public Pengusaha(String npwp, String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    public String getNpwp(){
        return npwp;
    }

    public void setNpwp(String npwp){
        this.npwp = npwp;
    }

    @Override
    public double hitungPajak(){
        return 0.15 * getPendapatan();
    }

    public int hitungMasaKerja() {
        LocalDate today = LocalDate.now();
        Period period = Period.between(getTgl_mulai_kerja(), today);
        return period.getYears() + 7;
    }
}
