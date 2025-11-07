package ma.enset.boisson;

public class Espresso extends Boisson{

    public Espresso() {
        super.description = "Espresso";
        super.price = 12;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
