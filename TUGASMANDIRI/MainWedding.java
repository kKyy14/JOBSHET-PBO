package TUGASMANDIRI;

public class MainWedding {
    public static void main(String[] args) {
        // Klien dibuat di luar Acara (Aggregation)
        Klien klien = new Klien("Andi & Rina", "0812xxxxxxx");

        // Acara membuat Kontrak sendiri di dalam constructor (Composition)
        Acara acara = new Acara("20 Desember 2026", "Gedung Sasana Krida Malang", klien, 3, "KTR-2026-001");

        // Vendor dibuat di luar, ditambahkan ke Acara (Aggregation)
        Vendor katering = new Vendor("Erick Catering", "Katering", 25000000);
        Vendor dekorasi = new Vendor("Nova Production", "Dekorasi", 15000000);
        acara.tambahVendor(katering);
        acara.tambahVendor(dekorasi);

        System.out.println(acara.info());

        // PercetakanUndangan hanya dipinjam sesaat lewat parameter (Dependency)
        PercetakanUndangan percetakan = new PercetakanUndangan("Percetakan Prima");
        acara.cetakUndangan(percetakan, "Undangan Andi & Rina");
    }
}