package Non_SI_Units;

public class Millimeter implements Unit {
    private double millimeter;

    public Millimeter(double milimeter) {
        this.millimeter = milimeter;
    }


    @Override
    public double convertToSI() {
        return millimeter / 1000;
    }
}
