package jobshet1;

public class RoadBike extends Bike {
    private int tireWidth;

    public void setTireWidth(int Width) {
        tireWidth = Width;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Tire Width : " + tireWidth + " mm");
        System.out.println("Bike Type : Road Bike");
    }
}