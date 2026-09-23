package TUGASMANDIRI;

public class Kontrak {
    private String nomorKontrak;
    private String tanggalKontrak;

    public Kontrak(String nomorKontrak, String tanggalKontrak) {
        this.nomorKontrak = nomorKontrak;
        this.tanggalKontrak = tanggalKontrak;
    }

    public String info() {
        return "No. Kontrak: " + nomorKontrak + " (dibuat " + tanggalKontrak + ")";
    }
}