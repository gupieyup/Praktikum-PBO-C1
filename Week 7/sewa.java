public class sewa {
    public static void main(String[] args) {
        vehicle kendaraan = new vehicle() {
            @Override
            public void calRent(int distance, float price) {
                System.out.println("Vehicle price = " + price);
            }
        };
        vehicle mobil = new car();
        vehicle bis = new bus();
        
        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);
        
        hitungSewa(kendaraan);
        hitungSewa(mobil);
        hitungSewa(bis);
    }

    public static void hitungSewa(vehicle v) {
        v.calRent(100, 2000);
    }
}
