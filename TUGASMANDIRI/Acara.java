package TUGASMANDIRI;

public class Acara {
    private String tanggal;
    private String lokasi;
    private Klien klien;
    private Vendor[] listVendor;
    private int jumlahVendorTerisi;
    private Kontrak kontrak;

    // Relasi: AGGREGATION (Acara - Klien)
    // Klien tidak dibuat di sini. Klien diterima sebagai parameter constructor,
    // artinya dibuat di luar (Main) lalu di-inject ke Acara -> Aggregation.
    // Relasi: COMPOSITION (Acara - Kontrak)
    // Kontrak dibuat SENDIRI oleh Acara lewat "new Kontrak(...)" di sini,
    // tanpa pernah menerimanya dari luar, dan TIDAK ADA setKontrak() -> Composition.
    public Acara(String tanggal, String lokasi, Klien klien, int kapasitasVendor, String nomorKontrak) {
        this.tanggal = tanggal;
        this.lokasi = lokasi;
        this.klien = klien; // Aggregation: klien diterima
        this.listVendor = new Vendor[kapasitasVendor];
        this.jumlahVendorTerisi = 0;
        this.kontrak = new Kontrak(nomorKontrak, tanggal); 
    }

    // Relasi: AGGREGATION (Acara - Vendor)
    // Vendor juga tidak dibuat di sini, hanya diterima lewat parameter method
    // Vendor adalah bisnis independen yang bisa dipakai acara lain juga
    public void tambahVendor(Vendor vendor) {
        if (jumlahVendorTerisi < listVendor.length) {
            listVendor[jumlahVendorTerisi] = vendor;
            jumlahVendorTerisi++;
        } else {
            System.out.println("Slot vendor untuk acara ini sudah penuh!");
        }
    }

    // Relasi: DEPENDENCY (Acara uses PercetakanUndangan)
    // PercetakanUndangan HANYA muncul sebagai parameter method ini
    // tidak disimpan sebagai atribut Acara -> Dependency (uses-a).
    public void cetakUndangan(PercetakanUndangan percetakan, String namaUndangan) {
        System.out.println("Acara di " + lokasi + " memesan cetak undangan...");
        percetakan.cetak(namaUndangan);
    }

    public String info() {
        String info = "";
        info += "Acara Pernikahan\n";
        info += "Tanggal: " + tanggal + "\n";
        info += "Lokasi: " + lokasi + "\n";
        info += "Klien: " + klien.info() + "\n";
        info += kontrak.info() + "\n";
        info += "Vendor:\n";
        for (int i = 0; i < jumlahVendorTerisi; i++) {
            info += "  - " + listVendor[i].info() + "\n";
        }
        return info;
    }
}