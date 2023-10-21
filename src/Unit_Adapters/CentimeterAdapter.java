package Unit_Adapters;

import Non_SI_Units.Centimeter;
import Non_SI_Units.Unit;

public class CentimeterAdapter implements Unit {
    private Centimeter centimeter;

    public CentimeterAdapter(Centimeter centimeter) {
        this.centimeter = centimeter;
    }


    @Override
    public double convertToSI() {
        return centimeter.convertToSI();
    }
}
