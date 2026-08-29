package TugasPraktikum;

public class RakSepatu {
    private int jumlahRak;
    private String bahan;

    public void setJumlahRak(int rak) {
        jumlahRak = rak;
    }

    public void setBahan(String bahanRak) {
        bahan = bahanRak;
    }

    public void tambahSepatu(String namaSepatu) {
        System.out.println(namaSepatu + " disimpan di rak sepatu.");
    }

    public void bersihkan() {
        System.out.println("Rak sepatu dibersihkan.");
    }

    public void cetakInfo() {
        System.out.println("Jumlah Rak  : " + jumlahRak);
        System.out.println("Bahan       : " + bahan);
        System.out.println("Jenis Objek : Rak Sepatu");
    }
}