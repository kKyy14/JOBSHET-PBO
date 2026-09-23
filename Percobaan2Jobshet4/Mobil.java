package Percobaan2Jobshet4;

public class Mobil {
    public String merk;
    public int biaya;

    public Mobil() {
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getMerk() {
        return merk;
    }
    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }
    public int getBiaya() {
        return biaya;
    }
    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }
}
