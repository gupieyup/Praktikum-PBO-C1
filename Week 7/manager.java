class manager extends pegawai {
    private int tunjangan = 700000;
    
    public manager(String nama) {
        setNama(nama);
    }
    
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}