package Percobaan4Jobshet4;

public class Penumpang {
    private String ktp;
    private String nama;

    public Penumpang(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }
    public String getKtp() {
        return this.ktp;
    }
    public String getNama() {
        return this.nama;
    }
    public String info() {
        String info = "";
        info += "Ktp: " + this.ktp + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}
