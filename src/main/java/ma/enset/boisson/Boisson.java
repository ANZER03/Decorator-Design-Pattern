package ma.enset.boisson;

public abstract class Boisson{
    protected String description;
    protected double price;

    public String getDescription(){
        return description;
    };

    public abstract double getPrice();
}
