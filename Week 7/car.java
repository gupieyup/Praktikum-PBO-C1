public class car extends vehicle {
    @Override
    public void calRent(int jarak, float harga) {
        float farePerKm = harga;
        farePerKm *= 0.5; 
        System.out.println("Harga sewa mobil = "+farePerKm);
    }
}
