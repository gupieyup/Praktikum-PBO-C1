import java.time.LocalDate;

public class Dosen extends Pegawai {
    private String fakultas;

    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt ,double gajiPokok,String fakultas){
        super(nip,nama,tanggalLahir,tmt,gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas(){
        return this.fakultas;
    }

    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    } 
}
