package TugasPraktikum;

public class Ac extends Elektronik {
    private int suhuCelcius;
    private int dayaPK; 
    public void setSuhuCelcius(int suhu) {
        suhuCelcius = suhu;
    }

    public void setDayaPK(int pk) {
        dayaPK = pk;
    }

    public void aturSuhu(int suhu) {
        suhuCelcius = suhu;
        System.out.println("Suhu AC diatur ke " + suhuCelcius + " derajat Celcius.");
    }

    public void aturModeHemat() {
        System.out.println("AC beralih ke mode hemat energi.");
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Suhu Saat Ini   : " + suhuCelcius + " C");
        System.out.println("Daya            : " + dayaPK + " PK");
        System.out.println("Jenis Perangkat : AC");
    }
}