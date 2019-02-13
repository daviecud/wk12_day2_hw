package ThemePark.Attractions;

import ThemePark.Interfaces.ISecurity;
import ThemePark.Visitors.Visitor;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating) {

        super(name, rating);
    }

    public Boolean allowedToRide(Visitor visitor) {
        Boolean age = visitor.getAge() < 15;
        return age;
    }
}
