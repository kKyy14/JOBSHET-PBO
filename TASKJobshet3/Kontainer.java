package TASKJobshet3;

public class Kontainer {
    private String nomorResi, namaPemilik;
    private double kapasitasMaksimal, beratMuatanSaatIni;

    public Kontainer(String nomorResi, String namaPemilik, double kapasitasMaksimal){
    this.nomorResi = nomorResi;
    this.namaPemilik = namaPemilik;
    this.kapasitasMaksimal = kapasitasMaksimal;
    this.beratMuatanSaatIni = 0;
    }

    public String getNomorResi(){
        return nomorResi;
    }
    public String getNamaPemilik(){
        return namaPemilik;
    }
    public double getKapasitasMaksimal(){
        return kapasitasMaksimal;
    }
    public double getBeratMuatanSaatIni(){
        return beratMuatanSaatIni;
    }

    public void tambahMuatan(double berat){
        if (beratMuatanSaatIni + berat <= kapasitasMaksimal){
            beratMuatanSaatIni += berat;
        } else {
            System.out.println("Maaf, berat muatan melebihi kapasitas maksimal kontainer.");
        }
    }
    public void turunkanMuatan(double berat){
        double batasMaksimal = beratMuatanSaatIni * 0.5;
        if (berat <= batasMaksimal){
        beratMuatanSaatIni -= berat;
        } else {
            System.out.println("Demi keselamatan, bongkar muatan kargo tidak boleh melebihi 50% dari muatan saat ini!");
        }
    }
}