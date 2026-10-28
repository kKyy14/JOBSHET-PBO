package Jobshet9Percobaan2;

public class Program {
 public static void main(String[] args) {
 Rektor pakRektor = new Rektor();
 Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
 Sarjana sarjanaCumlaude = new Sarjana("Dini");
 PascaSarjana masterCumlaude = new PascaSarjana("Elok");
 // pakRektor.beriSertifikatCumlaude(mhsBiasa);
 // dikomenkan karena mhsBiasa bukan cumlaude
 pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
 pakRektor.beriSertifikatCumlaude(masterCumlaude);
 }
}