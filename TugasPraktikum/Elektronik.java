package TugasPraktikum;

public class Elektronik {
    private String merk;
    private int tahunProduksi;

    public void setMerk(String merkName) {
        merk = merkName;
    }

    public void setTahunProduksi(int tahun) {
        tahunProduksi = tahun;
    }

    public void nyalakan() {
        System.out.println(merk + " dinyalakan.");
    }

    public void matikan() {
        System.out.println(merk + " dimatikan.");
    }

    public void cetakInfo() {
        System.out.println("Merk            : " + merk);
        System.out.println("Tahun Produksi  : " + tahunProduksi);
    }
}