package Non_SI_Units;

public class Centimeter implements Unit {
    private double centimeter;

    public Centimeter(double centimeter) {
        this.centimeter = centimeter;
    }


    @Override
    public double convertToSI() {
        return centimeter / 100;
    }
}
