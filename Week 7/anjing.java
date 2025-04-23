public class anjing extends anabul {
    public anjing(String nama){
        super(nama);
    }

    @Override 
    public void gerak(){
        System.out.println("Bergerak dengan cara melata");
    }

    public void suara(){
        System.out.println("Memiliki suara 'guk-guk'");
    }
}
