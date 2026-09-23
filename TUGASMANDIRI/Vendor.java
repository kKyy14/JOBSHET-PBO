package TUGASMANDIRI;

public class Vendor {
    private String nama;
    private String jenisLayanan;
    private int biaya;

    public Vendor(String nama, String jenisLayanan, int biaya) {
        this.nama = nama;
        this.jenisLayanan = jenisLayanan;
        this.biaya = biaya;
    }

    public String getNama() {
        return nama;
    }

    public String getJenisLayanan() {
        return jenisLayanan;
    }

    public int getBiaya() {
        return biaya;
    }

    public String info() {
        return jenisLayanan + " oleh " + nama + " (Rp" + biaya + ")";
    }
}