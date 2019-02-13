package ThemePark.Attractions;

import ThemePark.Interfaces.ISecurity;
import ThemePark.Interfaces.ITicketed;
import ThemePark.Visitors.Visitor;

public class Dodgems extends Attraction implements ITicketed, ISecurity {


    public Dodgems(String name, int rating) {
        super(name, rating);
    }

//    public Boolean allowedToRide(Visitor visitor) {
//        Boolean oldEnoughToRide = visitor.getAge() >= 12;
//        return oldEnoughToRide;
//    }

    @Override
    public double defaultPrice() {
        return 4.50;
    }



    public Boolean allowedToRide(Visitor visitor) {
        if(visitor.getAge() <= 12) {
            return true;
        }
        return false;
    }


    public double priceFor(Visitor visitor) {
        boolean halfPrice = allowedToRide(visitor);
        if (halfPrice) {
         return defaultPrice() / 2;
        }
        else{
            return defaultPrice();
        }
    }



}
