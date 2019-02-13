package ThemePark.Stalls;

public abstract class Stall {

    private String name;
    private String ownerName;
    private int parkingSpot;

    public Stall(String name, String ownerName, int parkingSpot) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getParkingSpotNumbers() {
        return parkingSpot;
    }

    public boolean getParkingSpot() {
        if(parkingSpot > 0 && parkingSpot < 5){
            return true;
        }
        return false;
    }

}
