package TUGASMANDIRI;

public class PercetakanUndangan {
    private String nama;

    public PercetakanUndangan(String nama) {
        this.nama = nama;
    }

    public void cetak(String namaUndangan) {
        System.out.println("[" + nama + "] Mencetak undangan: " + namaUndangan + "...");
        System.out.println("[" + nama + "] Selesai dicetak.");
    }
}