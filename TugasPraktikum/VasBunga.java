package TugasPraktikum;

public class VasBunga {
    private String bahan;
    private int tinggiCm;

    public void setBahan(String bahanVas) {
        bahan = bahanVas;
    }

    public void setTinggiCm(int tinggi) {
        tinggiCm = tinggi;
    }

    public void isiAirVas() {
        System.out.println("Vas diisi air untuk menjaga bunga tetap segar.");
    }

    public void gantiBunga(String namaBunga) {
        System.out.println("Bunga di dalam vas diganti dengan " + namaBunga + ".");
    }

    public void cetakInfo() {
        System.out.println("Bahan       : " + bahan);
        System.out.println("Tinggi      : " + tinggiCm + " cm");
        System.out.println("Jenis Objek : Vas Bunga");
    }
}