package TugasPraktikum2;

public class TestBarang {
    public static void main(String args[]){
        Barang brg1 = new Barang();
        brg1.kode = "ATK01";
        brg1.namaBarang = "Buku Gambar";
        brg1.hargaDasar = 7000;
        brg1.diskon = 0.1f;

        brg1.tampilData();
    }
}