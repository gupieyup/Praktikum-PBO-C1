/* Nama File    : Titik.Java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Gladys Paramadani Hersaputri / 24060123140177
 * Tanggal      : 20/02/2025
 */

public class Titik {
    /********** ATRIBUT **********/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /********** METHOD **********/
    //konstruktor untuk membuat titik (0,0)
    Titik(){
        this.absis = 0;
        this.ordinat = 0;
        counterTitik++;
    }

    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    int getKuadran(){
        if (absis >= 0 && ordinat >= 0) {
            return 1;
        } 
        else if (absis < 0 && ordinat > 0) {
            return 2;
        }
        else if (absis < 0 && ordinat < 0) {
            return 3;
        }
        else {
            return 4;
        }
    }

    double getJarakPusat(){
        return Math.sqrt(getAbsis() * getAbsis() + getOrdinat() * getOrdinat());
    }

    double getJarak(Titik T){
        return Math.sqrt(Math.pow(this.getAbsis() - T.getAbsis(), 2) + Math.pow(this.getOrdinat() - T.getOrdinat(), 2));
    }

    void refleksiX(){
        this.ordinat = this.ordinat * -1;
    }

    void refleksiY(){
        this.absis = this.absis * -1;
    }

    Titik getRefleksiX(){
        return new Titik(this.absis, this.ordinat * -1);
    }

    Titik getRefleksiY(){
        return new Titik(this.absis * -1, this.ordinat);
    }

    static int getCounterTitik(){
        return counterTitik;
    }

    //mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
} //end class Titik