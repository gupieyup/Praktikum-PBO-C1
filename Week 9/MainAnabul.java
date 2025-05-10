/**
 * Nama      : Gladys Paramadani Hersaputri
 * NIM       : 24060123140177
 * Tanggal   : 09 Mei 2025
 * File      : MainAnabul.java
 * Deskripsi : main class untuk generic koleksi anabul
 */

public class MainAnabul {
    public static void main(String[] args) {
        KoleksiAnabul<anabul> koleksiAnabul = new KoleksiAnabul<>();
        
        // Objek kucing
        koleksiAnabul.addAnabul(new kucing("Kitty"));
        koleksiAnabul.addAnabul(new kucing("Meow"));
        koleksiAnabul.addAnabul(new kucing("Neko"));
        koleksiAnabul.addAnabul(new kucing("Felix"));
        
        // Objek anjing
        koleksiAnabul.addAnabul(new anjing("Buddy"));
        koleksiAnabul.addAnabul(new anjing("Max"));
        koleksiAnabul.addAnabul(new anjing("Rex"));
        
        // Objek burung
        koleksiAnabul.addAnabul(new burung("Beo"));
        koleksiAnabul.addAnabul(new burung("Tweety"));
        koleksiAnabul.addAnabul(new burung("Eagle"));
        
        koleksiAnabul.showAll();
    }
}