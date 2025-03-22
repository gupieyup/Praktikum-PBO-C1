public class Lingkaran extends BangunDatar implements IResize {
    private double jari;

    public Lingkaran(){
        setJmlSisi(0);
    }

    public Lingkaran(double jari, String warna, String border){
        super(0, warna, border);
        this.jari = jari;
    }

    @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent){
        jari = jari * percent/100;
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI * jari * jari;
    }

    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Jari: " + getJari());
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}
