package jobshet2;

public class Karyawan {
    public int id;
    public String nama;
    public String jeniskelamin;
    public String jabatan;
    public int gaji;

    public void tampilBiodata() {
        System.out.println("id : "+ id);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jeniskelamin);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji: " + gaji);
    }
}
