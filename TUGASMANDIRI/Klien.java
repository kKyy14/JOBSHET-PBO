package TUGASMANDIRI;

public class Klien {
    private String nama;
    private String noHp;

    public Klien(String nama, String noHp) {
        this.nama = nama;
        this.noHp = noHp;
    }

    public String getNama() {
        return nama;
    }

    public String getNoHp() {
        return noHp;
    }

    public String info() {
        return nama + " (HP: " + noHp + ")";
    }
}