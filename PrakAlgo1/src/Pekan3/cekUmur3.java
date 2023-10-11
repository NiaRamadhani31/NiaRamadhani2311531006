package Pekan3;

import java.util.Scanner;

public class cekUmur3 {

	public static void main(String[] args) {
		int umur;
		char sim;
		Scanner v = new Scanner(System.in);
		System.out.println("Input umur Anda: ");
		umur= v.nextInt () ;
		System.out.println("Apakah Anda Sudah punya SIM C?");
		sim=v.next().charAt(0);
		v.close();
		if ((umur >= 17)&&(sim=='y')) {
			System.out.println("Anda sudah dewasa dan boleh bawa motor");
		}
		if ((umur >= 17)&&(sim!='y')) {
			System.out.println("Anda sudah dewasa tetapi tidak boleh bawa motor");
		}
		if ((umur >=17)&&(sim!='y')) {
		
		}

	}

}
