package Tugas9_Inheritance_PBO;

public class Main {
    public static void main(String[] args) {
    	Dokter pg = new Dokter("223040048", "2304506", "SPECIALIST","100.000.000");
        System.out.println(pg.getKodeDokter() + " - " + pg.getIdJabatan() + " - " + pg.getJabatan() + " - " + pg.getGaji());
    }
}
