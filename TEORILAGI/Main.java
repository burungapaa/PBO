package TEORILAGI;

/**
 *
 * @author Laptop HP
 */
public class Main {
    public static void main(String[] args) {
        
        //Menggunakan kelas InputPenumpang untuk mendapatkan Scanner
        InputPenumpang io = new InputPenumpang();
        
        System.out.println("=== APLIKASI PEMESANAN TIKET ===");
        
        System.out.print("Masukkan Nama Penumpang  : ");
        String nama = io.input.nextLine();
        
        System.out.print("Masukkan No Tiket        : ");
        String noTiket = io.input.nextLine();
        
        System.out.print("Tipe Tiket (R/V)         : ");
        String tipe = io.input.nextLine();
        
        Penumpang penumpang;
        
        //Membedakan dan membuat objek Penumpang
        if (tipe.equalsIgnoreCase("R")) {
            penumpang = new PenumpangRegular(nama, noTiket); 
            
            // Menampilkan data dengan Overloading
            ((PenumpangRegular) penumpang).tampilkanData("Mendapatkan Kursi Standar");
            
        } else if (tipe.equalsIgnoreCase("V")) {
            penumpang = new PenumpangVIP(nama, noTiket);
            
            ((PenumpangVIP) penumpang).tampilkanData("Akses Lounge Eksklusif");
            
        } else {
            System.out.println("\n--- Tipe Tiket Tidak Valid ---");
            io.input.close();
            return;
        }
        
        //Polimorfisme untuk memanggil method 
        System.out.println("\n--- Tampilan Data ---");
        penumpang.tampilkanData();
        System.out.println("================================");
        io.input.close();
    }
}
