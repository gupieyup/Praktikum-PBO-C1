public class burung extends anabul {
    public burung(String nama){
        super(nama);
    }

    @Override
    public void gerak(){
        System.out.println("Bergerak dengan cara terbang");
    }

    public void suara(){
        System.out.println("Memiliki suara 'cuit'");
    }
}
