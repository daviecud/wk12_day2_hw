package ThemePark.Visitors;

public class Visitor {

    private String name;
    private int age;
    private double heightInMeters;
    private double money;

    public Visitor(String name, int age, double heightInMeters, double money) {
        this.name = name;
        this.age = age;
        this.heightInMeters = heightInMeters;
        this.money = money;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getHeight() {
        return this.heightInMeters;
    }

    public double getMoney() {
        return this.money;
    }

}
