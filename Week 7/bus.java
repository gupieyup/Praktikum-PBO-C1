public class bus extends vehicle {
    @Override
    public void calRent(int distance, float price) {
        float fareDistance = price;
        fareDistance *= 1.5; 
        System.out.println("Rental price = "+fareDistance);
    }
}
