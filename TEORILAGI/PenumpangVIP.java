package TEORILAGI;
/**
 *
 * @author Laptop HP
 */
class PenumpangVIP extends Penumpang {
    
    public PenumpangVIP(String nama, String noTiket) {
        super(nama, noTiket);
    }
    
    //Implementasi dari method abstract di class Penumpang
    @Override
    public double hitungHargaTiket(){
        return 200000;
    }
    
    //Overloading, tambahan method dengan parameter
    public void tampilkanData(String fasilitas) {
        tampilkanData(); //Memanggil method tanpa parameter
        System.out.println("Tipe Tiket        : VIP");
        System.out.println("Fasilitas Khusus  : " + fasilitas);
    }
}
