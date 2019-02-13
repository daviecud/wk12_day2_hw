package ThemePark.Stalls;

public class CandyFlossStall extends Stall {



    public CandyFlossStall(String name, String ownerName, int parkingSpot ) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public double defaultPrice() {
        return 4.20;
    }
}
