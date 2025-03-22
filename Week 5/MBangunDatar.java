public class MBangunDatar {
    public static void main(String[] args) {
        // Membuat Objek Bangun Datar
        // BangunDatar B1 = new BangunDatar();
        // B1.printInfo();
        // System.out.println();

        BangunDatar P1 = new Persegi(10,"Merah","Thin");
        System.out.println("Luas P1: " + P1.getLuas());
        
        // Membuat Objek Persegi
        Persegi P2 = new Persegi(5, "Biru", "Bold");
        System.out.println("Luas P2: " + P2.getLuas());
        
        BangunDatar L1 = new Lingkaran(7,"Hijau","Bold");
        System.out.println("Luas L1: " + L1.getLuas());

        // Membuat Objek Lingkaran
        Lingkaran L2 = new Lingkaran(14, "Kuning", "Normal");
        System.out.println("Luas L2: " + L2.getLuas());

        System.out.println("Apakah Luas P2 dan L2 sama? " + P2.isEqualLuas(L2));
        System.out.println("Apakah Keliling P1 dan L1 sama? " + P1.isEqualKeliling(L2));

        BangunDatar.printCounterBangunDatar();
    }
}