package ThemePark.Attractions;

public abstract class Attraction {

        String name;
        int rating;

    public Attraction(String name, int rating) {
        this.name = name;
        this.rating = rating;

    }

    public String getName() {
        return this.name;
    }

    public int getRating() {
        return this.rating;
    }


}
