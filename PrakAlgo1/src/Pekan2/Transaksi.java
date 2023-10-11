package Pekan2;

public class Transaksi {

	public static void main(String[] args) {
		// Input harga barang, jumlah barang, dan diskon
        double hargaBarang = 337000;
        int jumlahBarang = 5;
        double diskon = 25; // Dalam persen

        // Menghitung total harga sebelum diskon
        double totalSebelumDiskon = hargaBarang * jumlahBarang;

        // Menghitung besaran diskon
        double besaranDiskon = (diskon / 100) * totalSebelumDiskon;

        // Menghitung total harga setelah diskon
        double totalSetelahDiskon = totalSebelumDiskon - besaranDiskon;

        // Menampilkan output
        System.out.println("Total harga yang dibayarkan = Rp. " + totalSetelahDiskon);

        
	}
	
}

	