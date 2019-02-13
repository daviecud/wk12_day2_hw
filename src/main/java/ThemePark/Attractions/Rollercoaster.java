package ThemePark.Attractions;

import ThemePark.Interfaces.ISecurity;
import ThemePark.Interfaces.ITicketed;
import ThemePark.Visitors.Visitor;

public class Rollercoaster extends Attraction implements ITicketed, ISecurity {

    public Rollercoaster(String name, int rating) {
        super(name, rating);
    }



    @Override
    public double defaultPrice() {
        return 8.40;
    }


    public boolean checkHeightOfVisitor(Visitor visitor) {
        if (visitor.getHeight() > 2.00) {
            return true;
        }
        return false;
    }

    public Boolean allowedToRide(Visitor visitor) {
        return checkHeightOfVisitor(visitor);
    }

    @Override
    public double priceFor(Visitor visitor){

    boolean priceIfTall = checkHeightOfVisitor(visitor);
    if(priceIfTall)

    {
        return defaultPrice() * 2;
    }
    return defaultPrice();


}

}




