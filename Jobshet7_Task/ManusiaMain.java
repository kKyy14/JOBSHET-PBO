package Jobshet7_Task;

class Manusia {
    public void bernafas() {
        System.out.println("Manusia bernafas");
    }
    public void makan() {
        System.out.println("Manusia makan");
    }
}

class Dosen extends Manusia {
    public void makan() {
        System.out.println("Dosen makan");
    }

    public void lembur() {
        System.out.println("Dosen lembur");
    }
}

class Mahasiswa extends Manusia {
    public void makan() {
        System.out.println("Mahasiswa makan");
    }

    public void tidur() {
        System.out.println("Mahasiswa tidur");
    }
}

public class ManusiaMain {
    public static void main(String[] args) {
        Manusia m;

        m = new Manusia();
        m.bernafas();
        m.makan();

        m = new Dosen();
        m.bernafas();
        m.makan();

        m = new Mahasiswa();
        m.bernafas();
        m.makan();
    }
}