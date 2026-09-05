package jobshet2;

public class TestKaryawan {
    public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan();
        karyawan1.id = 1;
        karyawan1.nama = "Dicky";
        karyawan1.jeniskelamin = "Laki-laki";
        karyawan1.jabatan = "Manager";
        karyawan1.gaji = 1000000;
        karyawan1.tampilBiodata();
    }
}
