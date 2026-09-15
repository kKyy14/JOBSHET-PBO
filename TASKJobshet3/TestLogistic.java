package TASKJobshet3;

import java.util.Scanner;

public class TestLogistic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT.Maju Bersama", 5000);

        System.out.println("Nama pemilik kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        System.out.print("\nMasukkan berat muatan yang ingin ditambahkan (kg): ");
        double muatanMasuk = scanner.nextDouble();
        kontainerAlfa.tambahMuatan(muatanMasuk);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.print("\nMasukkan berat muatan yang ingin ditambahkan lagi (kg): ");
        double muatanMasuk2 = scanner.nextDouble();
        kontainerAlfa.tambahMuatan(muatanMasuk2);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.print("\nMasukkan berat muatan yang ingin diturunkan (kg): ");
        double muatanKeluar = scanner.nextDouble();
        kontainerAlfa.turunkanMuatan(muatanKeluar);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
        
        System.out.print("\nMasukkan berat muatan yang ingin diturunkan (kg): ");
        double muatanKeluar2 = scanner.nextDouble();
        kontainerAlfa.turunkanMuatan(muatanKeluar2);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
    }
}