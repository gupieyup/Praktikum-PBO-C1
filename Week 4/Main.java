import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate tanggalSekarang = LocalDate.now();
        System.out.println("Tanggal saat ini: " + tanggalSekarang.format(DateTimeFormatter.ofPattern("d MMMM yyyy")));
        
        // Membuat objek DosenTetap 
        DosenTetap D1 = new DosenTetap(
            "199908022023091001", 
            "Mark Lee", 
            LocalDate.of(1999, 8, 2),
            LocalDate.of(2023, 9, 21), 
            12000000.0, 
            "Fakultas Teknik",
            "002345678"
        );
        
        // Membuat objek DosenTamu
        DosenTamu D2 = new DosenTamu(
            "200509212024082005", 
            "Glad", 
            LocalDate.of(2005, 9, 21), 
            LocalDate.of(2024, 8, 2), 
            8000000.0, 
            "Fakultas Kedokteran", 
            "000987654",
            LocalDate.of(2027, 4, 30) 
        );
        
        // Membuat objek Tendik
        Tendik T1 = new Tendik(
            "H.7.199702142022071001", 
            "Jung Jaehyun", 
            LocalDate.of(1997, 2, 14), 
            LocalDate.of(2022, 7, 29), 
            5000000.0, 
            "Akademik"
        );
        
        System.out.println("\n ----- INFORMASI DOSEN TETAP ----- \n");
        D1.printInfo();
        System.out.println("\n----- INFORMASI DOSEN TAMU ----- \n");
        D2.printInfo();
        System.out.println("\n----- INFORMASI TENDIK ----- \n");
        T1.printInfo();
    }
}
