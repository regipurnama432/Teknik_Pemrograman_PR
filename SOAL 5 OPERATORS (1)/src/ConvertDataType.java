/*
 * Program   : ConvertDataType.java (Soal5)
 * Deskripsi : Mengkonversi tipe data yang berukuran besar ke kecil
 * Nama      : Regi Purnama
 * Tanggal   : Jum'at, 11/02/2022
 */


public class ConvertDataType {
	
	 static short methodOne(long l)
	 {
		 int i = (int) l;
		 return (short)i;
	 }

	 public static void main(String[] args) {
		double d = 10.25;
		float f = (float) d;
		byte b = (byte) methodOne((long) f);
		System.out.println(b);
	}

}
