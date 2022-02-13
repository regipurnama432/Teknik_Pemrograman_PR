/*
 * Program   : SolutionStrings.java (Soal6)
 * Deskripsi : Menjumlahkan dua strings, membandingkan dua strings
 * 			   Menggabungkan dua strings	
 * Nama      : Regi Purnama
 * Tanggal   : Jum'at, 11/02/2022
 */


import java.io.*;
import java.util.*;

public class SolutionStrings {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	     
	        System.out.println(A.length() + B.length());	//Menjumlahkan dua strings; ouputnya angka
	        
	    if(A.compareTo(B) > 0){								//Membandingkan dua strings; outputnya "Yes" atau "No"
	        System.out.println("Yes");
	    } else {
	        System.out.println("No");
	    }

	    A = (A.substring(0,1)).toUpperCase() + A.substring(1);       
	    B = (B.substring(0,1)).toUpperCase() + B.substring(1);
	    System.out.println(A + " " + B);					//Outputnya gabungan strings A dan strings B
	}

}
