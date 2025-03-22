import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MManusia {
    public static void main(String[] args) {
        LocalDate tanggalSekarang = LocalDate.now();
        System.out.println("Tanggal saat ini: " + tanggalSekarang.format(DateTimeFormatter.ofPattern("d MMMM yyyy")));

        // Membuat Objek PNS
        Pns p1 = new Pns("198302032006041002", "Satriyo", LocalDate.of(2006, 4, 1), "Jl. Seroja", 15000000);
        Pns p2 = new Pns("198004212010041002", "Panji", LocalDate.of(2010, 4, 1), null, 10000000);
        p2.setAlamat("Jl. Panorama 111 Tembalang");

        // Membuat Objek Pengusaha
        Pengusaha pe1 = new Pengusaha("000-556-773-212-000-5","Adhy", LocalDate.of(2000, 1, 1), "Jl.Air",55000000);

        // Membuat Objek Petani
        Petani pt1 = new Petani("Wonogiri", "Nugraha" , LocalDate.of(1977, 1, 9), "Jl. Bunga 9 Tembalang",5000000);


        System.out.println("\n ----- INFORMASI PNS ----- \n");
        p1.printInfo();
        System.out.println("Pajak PNS: " + p1.hitungPajak());
        System.out.println("Masa Kerja PNS: " + p1.hitungMasaKerja() + " hari");
        System.out.println("\n");
        p2.printInfo();
        System.out.println("Pajak PNS: " + p2.hitungPajak());
        System.out.println("Masa Kerja PNS: " + p2.hitungMasaKerja() + " hari");
        
        System.out.println("\n ----- INFORMASI PENGUSAHA ----- \n");
        pe1.printInfo();
        System.out.println("Pajak Pengusaha: " + pe1.hitungPajak());
        System.out.println("Masa Kerja Pengusaha: " + pe1.hitungMasaKerja() + " hari");
        
        System.out.println("\n ----- INFORMASI PETANI ----- \n");
        pt1.printInfo();
        System.out.println("Pajak Petani pt1: " + pt1.hitungPajak());
        System.out.println("Masa Kerja pt1: " + pt1.hitungMasaKerja() + " hari");
        
        System.out.println("\n");
        System.out.println("Jumlah Manusia: " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS: " + Pns.getCounterPNS());
        System.out.println("Jumlah Pengusaha: " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani: " + Petani.getCounterPetani());
    } 
}
