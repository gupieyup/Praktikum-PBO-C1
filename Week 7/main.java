public class main {
    public static void main(String[] args) {

        kucing k = new kucing("Kitty");
        anjing a = new anjing("Puppy");
        burung b = new burung("Beo");

        anabul[] anabuls = {k,a,b};

        for(anabul Anabul : anabuls){
            System.out.println("Nama: " + Anabul.getNama());
            Anabul.gerak();
            Anabul.suara();
            System.out.println();
        }
    }
}
