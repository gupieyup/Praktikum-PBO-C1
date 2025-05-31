import java.util.HashMap;
import java.util.Map;

/**
 * Nama : Gladys Paramadani Hersaputri
 * NIM  : 24060123140177
 * Lab  : PBO C1
 * File: LambdaMap.java
 * Deskripsi: Menampilkan key (NIM) dan value (nama mahasiswa) dari Map menggunakan ekspresi lambda.
 */

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();

        // Menambahkan data NIM dan nama mahasiswa
        mahasiswaMap.put("230177", "Gladys");
        mahasiswaMap.put("220199", "Mark");
        mahasiswaMap.put("210068", "Jeno");
        mahasiswaMap.put("22008", "Jaemin");

        // Menampilkan key dan value menggunakan lambda
        mahasiswaMap.forEach((nim, nama) -> 
            System.out.println("NIM: " + nim + ", Nama: " + nama)
        );
    }
}