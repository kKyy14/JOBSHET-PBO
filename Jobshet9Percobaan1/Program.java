package Jobshet9Percobaan1;

public class Program {
 public static void main(String[] args) {
 Kucing kucingKampung = new Kucing();
 Ikan lumbaLumba = new Ikan();
 // percobaan 1 soal 2
 //Naga nagaBonar = new Naga();
 Orang ani = new Orang("Ani");
 Orang budi = new Orang("Budi");
 ani.peliharaHewan(kucingKampung);
 budi.peliharaHewan(lumbaLumba);
 ani.ajakPeliharaanJalanJalan();
 budi.ajakPeliharaanJalanJalan();
 }
}