package TugasPraktikum2;

public class Peminjaman {
    public int id;
    public String namaMember;
    public String namaGame;
    public double harga;
    public int lamaSewa;

    public double hitungTotalBayar(){
        double totalBayar = lamaSewa * harga;
        return totalBayar;
    }

    public void tampilDataPeminjaman(){
        System.out.println("Id            : " + id);
        System.out.println("Nama Member   : " + namaMember);
        System.out.println("Nama Game     : " + namaGame);
        System.out.println("Lama Sewa     : " + lamaSewa+" hari");
        System.out.println("Total Bayar   : " + hitungTotalBayar());
    }
}