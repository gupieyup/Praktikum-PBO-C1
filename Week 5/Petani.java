import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak{
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani(){
        counterPetani++;
    }

    public Petani(String asal_kota, String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public static int getCounterPetani(){
        return counterPetani;
    }

    public String getAsal_kota(){
        return asal_kota;
    }

    public void setAsal_kota(String asal_kota){
        this.asal_kota = asal_kota;
    }

    @Override
    public double hitungPajak(){
        return 0;
    }

    public int hitungMasaKerja() {
        LocalDate today = LocalDate.now();
        Period period = Period.between(getTgl_mulai_kerja(), today);
        int totalHari = (period.getYears() * 365) + (period.getMonths() * 30) + period.getDays() + 1;
        return totalHari;
    }
}
