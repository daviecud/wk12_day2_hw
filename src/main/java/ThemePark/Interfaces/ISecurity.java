package ThemePark.Interfaces;

import ThemePark.Visitors.Visitor;

public interface ISecurity {

    public Boolean allowedToRide(Visitor visitor);
}
