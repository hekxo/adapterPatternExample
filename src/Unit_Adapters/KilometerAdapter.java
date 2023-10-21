package Unit_Adapters;

import Non_SI_Units.Kilometer;
import Non_SI_Units.Unit;

public class KilometerAdapter implements Unit {
    private Kilometer kilometer;

    public KilometerAdapter(Kilometer kilometer) {
        this.kilometer = kilometer;
    }


    @Override
    public double convertToSI() {
        return kilometer.convertToSI();
    }
}
