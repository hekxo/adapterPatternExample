package Non_SI_Units;

public class Decimeter  implements Unit {
    private double decimeter;

    public Decimeter(double decimeter) {
        this.decimeter = decimeter;
    }


    @Override
    public double convertToSI() {
        return decimeter / 10;
    }
}
