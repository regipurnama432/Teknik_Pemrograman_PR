/*
 * Program   : Constants.java (Soal3)
 * Deskripsi : Merubah ukuran kertas dari INCH ke CM
 * Nama      : Regi Purnama
 * Tanggal   : Jum'at, 11/02/2022
 */


public class Constants {

	public static void main(String[] args) {
		final double CM_PER_INCH = 2.54;		//CM_PER_INCH berperan sebagai konstanta
		double paperWidth = 8.5;
		double paperHeight = 11;
		System.out.println("Paper size in centimeters: " +
		paperWidth * CM_PER_INCH + " by " + paperHeight *
		CM_PER_INCH); 
	}

}

