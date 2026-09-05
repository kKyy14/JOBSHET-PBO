package TugasPraktikum2;

public class TestPeminjaman {
    public static void main(String args[]){
        Peminjaman pinjam1 = new Peminjaman();
        pinjam1.id = 1;
        pinjam1.namaMember = "Dicky";
        pinjam1.namaGame = "Pes 2021";
        pinjam1.harga = 34000;
        pinjam1.lamaSewa = 3;
        pinjam1.tampilDataPeminjaman();
    }
}
