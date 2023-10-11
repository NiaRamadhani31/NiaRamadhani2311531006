package Pekan3;
import java.util.Scanner;
public class cekUmur2 {

	public static void main(String[] args) {
		int umur;
		Scanner v = new Scanner(System.in);
		System.out.println("Input umur Anda: ");
		umur= v.nextInt () ;
		if (umur >= 17) {
			System.out.println("Anda sudah dewasa");
			
		} else {
			System.out.println("Anda belum dewasa");
		
		}
	}

}
