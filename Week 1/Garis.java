/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Gladys Paramadani Hersaputri / 24060123140177
 * Tanggal      : 20/02/2025
 */

 public class Garis {
    /********** ATRIBUT **********/
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;

    /********** METHOD **********/
    Garis(){
        this.titikAwal = new Titik(0,0);
        this.titikAkhir = new Titik(1,1);
        counterGaris++;
    }

    Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    Titik getTitikAwal(){
        return this.titikAwal;
    }

    Titik getTitikAkhir(){
        return this.titikAkhir;
    }

    static int getCounterGaris(){
        return counterGaris;
    }

    void setTitikAwal(Titik titikAwal){
        this.titikAwal = titikAwal; 
    }

    void setTitikAkhir(Titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }

    double getPanjang(){
        return Math.sqrt(Math.pow(titikAkhir.getAbsis() - titikAwal.getAbsis(),2) + Math.pow(titikAkhir.getOrdinat() - titikAwal.getOrdinat(), 2));
    }

    double getGradien(){
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    Titik getTitikTengah(){
        double absis = (titikAwal.getAbsis() + titikAkhir.getAbsis())/2;
        double ordinat = (titikAwal.getOrdinat() + titikAkhir.getOrdinat())/2;
        return new Titik(absis,ordinat);
    }

    boolean isSejajar(Garis G){
        return this.getGradien() == G.getGradien();
    }

    boolean isTegakLurus(Garis G){
        return this.getGradien() * G.getGradien() == -1;
    }

    void printGaris(){
        System.out.println("Titik Awal (" + titikAwal.getAbsis() + "," + titikAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir (" + titikAkhir.getAbsis() + "," + titikAkhir.getOrdinat() + ")");
    }

    void printPersamaanGaris(){
        double m = this.getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
         System.out.println("y = " + m + "x" + " + " + c);
    }
 }