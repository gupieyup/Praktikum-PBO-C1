import java.util.ArrayList;

public class testPolimorfisme {
    public static void main(String[] args) {

        pegawai pegawai1 = new programmer("Mira");
        pegawai pegawai2 = new manager("Joko");
        pegawai pegawai3 = new manager("Argo");
        
        ArrayList<pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);
        
        for (pegawai emp : emps) {
            emp.tampilData();
            System.out.println("\n");
        }

        // Menambahkan data pegawai 4 dan pegawai 5 tanpa menggunakan polimorfisme 
        programmer pegawai4 = new programmer("Mark Lee");
        ArrayList<programmer> programmerList = new ArrayList<>();
        programmerList.add(pegawai4);
        for (programmer programmer : programmerList) {
            programmer.tampilData();
        }

        manager pegawai5 = new manager("Glad");
        ArrayList<manager> managerList = new ArrayList<>();
        managerList.add(pegawai5);
        System.out.println("\n");
        for (manager manajer : managerList) {
            manajer.tampilData();
        }
    }
}
