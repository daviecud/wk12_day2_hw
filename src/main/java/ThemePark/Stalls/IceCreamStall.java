package ThemePark.Stalls;

public class IceCreamStall extends Stall {

    public IceCreamStall (String name, String ownerName, int parkingSpot ) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public double defaultPrice() {
        return 2.80;
    }
}