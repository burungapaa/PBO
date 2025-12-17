package TEORILAGI;
/**
 *
 * @author Laptop HP
 */
class PenumpangRegular extends Penumpang {
    
    public PenumpangRegular(String nama, String noTiket) {
        super(nama, noTiket);
    }
    
    //Implementasi dari method abstract di class Penumpang
    @Override
    public double hitungHargaTiket() {
        return 100000;
    }
    
    //Overloading, tambahan method dengan parameter
    public void tampilkanData(String keterangan) {
        tampilkanData(); //Memanggil method tanpa parameter
        System.out.println("Tipe Tiket    : Regular");
        System.out.println("Keterangan    : " + keterangan);
    }
}
