package Unit_Adapters;

import Non_SI_Units.Decimeter;
import Non_SI_Units.Unit;

public class DecimeterAdapter implements Unit {
    private Decimeter decimeter;

    public DecimeterAdapter(Decimeter decimeter) {
        this.decimeter = decimeter;
    }


    @Override
    public double convertToSI() {
        return decimeter.convertToSI();
    }
}
