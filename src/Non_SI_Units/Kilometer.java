package Non_SI_Units;

public class Kilometer implements Unit {
    private double kilometer;

    public Kilometer(double kilometer) {
        this.kilometer = kilometer;
    }


    @Override
    public double convertToSI() {
        return kilometer * 1000;
    }
}
