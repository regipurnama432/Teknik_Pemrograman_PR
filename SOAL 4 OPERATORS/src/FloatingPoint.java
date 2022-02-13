/*
 * Program   : FloatingPoint.java (Soal4)
 * Deskripsi : Membulatkan bilangan dengan menggunakan fungsi Math.round()
 * Nama      : Regi Purnama
 * Tanggal   : Jum'at, 11/02/2022
 */


public class FloatingPoint {

	public static void main(String[] args) {
		double x = 92.98;					//Bilangan sebelum dibulatkan 
		int nx = (int) Math.round(x);	   /*Math.round() berfungsi untuk membulatkan angka
		 									desimal ke bilangan bulat terdekat*/
	System.out.println(Math.round(x));	
	}

}
