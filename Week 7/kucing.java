public class kucing extends anabul {
    public kucing(String nama){
        super(nama);
    }

    @Override
    public void gerak(){
        System.out.println("Bergerak dengan cara melata");
    }

    public void suara(){
        System.out.println("Memiliki suara 'meong'");
    }
}
