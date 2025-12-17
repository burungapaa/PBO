package TEORILAGI;

/**
 *
 * @author Laptop HP
 */
abstract class Penumpang {
    protected String nama;
    protected String noTiket;
    
    public Penumpang(String nama, String noTiket){
        this.nama = nama;
        this.noTiket = noTiket;
    }
    //Method abstract, harus diimplementasikan oleh subclass
    public abstract double hitungHargaTiket();
    
    public void tampilkanData() {
        System.out.println("Nama          : " + nama);
        System.out.println("No Tiket      : " + noTiket);
        System.out.println("Harga Tiket   : Rp " + hitungHargaTiket() );
    }
}
