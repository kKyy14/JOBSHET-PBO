package TugasPraktikum;

public class Tv extends Elektronik {
    private int ukuranInci;
    private String resolusi;

    public void setUkuranInci(int ukuran) {
        ukuranInci = ukuran;
    }

    public void setResolusi(String res) {
        resolusi = res;
    }

    public void gantiChannel(int nomorChannel) {
        System.out.println("Berpindah ke channel " + nomorChannel);
    }

    public void aturVolume(int level) {
        System.out.println("Volume diatur ke level " + level);
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Ukuran Layar    : " + ukuranInci + " inci");
        System.out.println("Resolusi        : " + resolusi);
        System.out.println("Jenis Perangkat : TV");
    }
}