package Unit_Adapters;

import Non_SI_Units.Millimeter;
import Non_SI_Units.Unit;

public class MillimeterAdapter implements Unit {
    private Millimeter millimeter;

    public MillimeterAdapter(Millimeter millimeter) {
        this.millimeter = millimeter;
    }


    @Override
    public double convertToSI() {
        return millimeter.convertToSI();
    }
}
