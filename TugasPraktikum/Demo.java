package TugasPraktikum;

public class Demo {
    public static void main(String[] args) {

        System.out.println("Objek AC");
        Ac ac1 = new Ac();
        ac1.setMerk("Panasonic");
        ac1.setTahunProduksi(2020);
        ac1.setDayaPK(1);
        ac1.nyalakan();
        ac1.aturSuhu(21);
        ac1.aturModeHemat();
        ac1.cetakInfo();
        ac1.matikan();
        System.out.println();

        System.out.println("Objek TV");
        Tv tv1 = new Tv();
        tv1.setMerk("POLYTRON");
        tv1.setTahunProduksi(2022);
        tv1.setUkuranInci(32);
        tv1.setResolusi("Standard HD");
        tv1.nyalakan();
        tv1.gantiChannel(20);
        tv1.aturVolume(23);
        tv1.cetakInfo();
        tv1.matikan();
        System.out.println();

        System.out.println("Objek Rak Sepatu");
        RakSepatu rak1 = new RakSepatu();
        rak1.setJumlahRak(5);
        rak1.setBahan("Plastik");
        rak1.tambahSepatu("Sepatu Sneakers");
        rak1.bersihkan();
        rak1.cetakInfo();
        System.out.println();

        System.out.println("Objek Vas Bunga");
        VasBunga vas1 = new VasBunga();
        vas1.setBahan("Plastik");
        vas1.setTinggiCm(30);
        vas1.isiAirVas();
        vas1.gantiBunga("Bougenville");
        vas1.cetakInfo();
    }
}
