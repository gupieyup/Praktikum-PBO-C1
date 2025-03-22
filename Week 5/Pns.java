import java.time.LocalDate;
import java.time.Period;

public class Pns extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public Pns(){
        counterPNS++;
    }

    public Pns(String nip, String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public static int getCounterPNS(){
        return counterPNS;
    }

    public String getNip(){
        return nip;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    @Override
    public double hitungPajak(){
        return 0.1 * getPendapatan();
    }

    public int hitungMasaKerja() {
        LocalDate today = LocalDate.now();
        Period period = Period.between(getTgl_mulai_kerja(), today);
        int totalHari = (period.getYears() * 365) + (period.getMonths() * 30) + period.getDays() + 7;
        return totalHari;
    }
}
