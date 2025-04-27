public class programmer extends pegawai {
    private int bonus = 450000;
    
    public programmer(String nama) {
        setNama(nama);
    }
    
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}
