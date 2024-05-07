package Tugas9_Inheritance_PBO;
public class Dokter extends Jabatan {
	 private String kodedokter;
	 
	 public Dokter(String kodedokter, String idjabatan, String jabatan, String gaji) {
		 super(idjabatan,jabatan,gaji);
		 setKodeDokter(kodedokter);
	 }
	 public String getKodeDokter()
	{
		 return kodedokter;
		 }
	 
	 public void setKodeDokter(String kodedokter) {
		 this.kodedokter = kodedokter;
	 }
	}
