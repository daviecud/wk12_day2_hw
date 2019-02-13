package ThemePark.Stalls;

import ThemePark.Interfaces.ISecurity;
import ThemePark.Visitors.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, int parkingSpot ) {

        super(name, ownerName, parkingSpot);
    }

    @Override
    public double defaultPrice() {
        return 6.60;
    }

    public Boolean allowedToRide(Visitor visitor) {
        Boolean oldEnoughToPurchase = visitor.getAge() >= 18;
        return oldEnoughToPurchase;
    }


}