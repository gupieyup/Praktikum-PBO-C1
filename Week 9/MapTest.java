/**
 * Nama      : Gladys Paramadani Hersaputri
 * NIM       : 24060123140177
 * Tanggal   : 07 Mei 2025
 * File      : MapTest.java
 * Deskripsi : Program yang menggunakan Generic untuk pasangan Kunci-Nilai
 */

 import java.util.*;

 public class MapTest {
     public static void main(String[] args) {
         // kunci -> integer, nilai -> string
         Map<Integer, String> map = new HashMap<Integer, String>();
 
         // menempatkan elemen kunci dan nilai
         map.put(1, "satu");
         map.put(2, "dua");
 
         // mengambil elemen pertama
         System.out.println(map.get(1));
 
         // mengambil keseluruhan kunci sebagai objek collection Set
         for (Integer k : map.keySet()) {
            System.out.println("key: " + k + ", value: " + map.get(k));
        }
         // bagaimana iterasi untuk mengambil keseluruhan nilai dari kunci? tulis pada laporan anda!
         // petunjuk : gunakan iterasi seperti program ArrayListTest
     }
 } 