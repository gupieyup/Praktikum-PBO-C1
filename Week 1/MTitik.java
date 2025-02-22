/* Nama File    : MTitik.Java
 * Deskripsi    : berisi main dalam class Titik
 * Pembuat      : Gladys Paramadani Hersaputri / 24060123140177
 * Tanggal      : 20/02/2025
 */

public class MTitik {
    public static void main(String[] args){
        System.out.println("Titik T1: ");
        Titik T1 = new Titik(); //membuat objek titik T1 (0,0)
        T1.setAbsis(3); //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); //mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); //mencetak koordinat T1 ke layar
        System.out.println("");
        
        System.out.println("Titik T1 Setelah Digeser: ");
        T1.geser(3,4); //menggeser T1 sejauh (3,4)
        T1.printTitik(); //menampilkan koordinat T1 setelah digeser

        System.out.println("Titik T1 Setelah Direfleksi: ");
        T1.refleksiX();
        T1.refleksiY();
        T1.printTitik();
        System.out.println("Kuadran: " + T1.getKuadran());
        System.out.println("");
        
        System.out.println("Titik T2: ");
        Titik T2 = new Titik(-5,5);
        T2.printTitik();
        System.out.println("Kuadran: " + T2.getKuadran() + "\n");

        System.out.println("Titik T2 Refleksi Terhadap Sumbu X: ");
        Titik T4 = T2.getRefleksiX();
        T4.printTitik();
        System.out.println("Kuadran: " + T4.getKuadran() + "\n");
        
        System.out.println("Titik T2 Refleksi Terhadap Sumbu Y: ");
        Titik T5 = T2.getRefleksiY();
        T5.printTitik();
        System.out.println("Kuadran: " + T5.getKuadran() + "\n");
        
        System.out.println("Titik T3: ");
        Titik T3 = T2;
        T3.setAbsis(7);
        T3.setOrdinat(-8);
        T3.printTitik();
        System.out.println("Kuadran: " + T3.getKuadran());
        System.out.println("");

        System.out.println("Jumlah Objek Titik: " + Titik.getCounterTitik());
    
        System.out.println("Jarak T1 ke Titik Pusat (0,0): " + T1.getJarakPusat());

        System.out.println("Jarak T1 ke Titik T2: " + T1.getJarak(T2));
        

    }
}