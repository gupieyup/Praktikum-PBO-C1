public class MBangunDatar {
    public static void main(String[] args) {
        // Membuat Objek Bangun Datar
        BangunDatar B1 = new BangunDatar(8, "Merah", "Thin");
        B1.printInfo();
        System.out.println();
        
        // Membuat Objek Persegi
        Persegi P1 = new Persegi(4, "Biru", "Bold");
        P1.printInfo();
        System.out.println();
        
        // Membuat Objek Lingkaran
        Lingkaran L1 = new Lingkaran(3.14, "Kuning", "Normal");
        L1.printInfo();
        System.out.println();

        BangunDatar.printCounterBangunDatar();
    }
}
