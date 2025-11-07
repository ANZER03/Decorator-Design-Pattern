package ma.enset.boisson;

public class Cappucino extends Boisson{

    public Cappucino() {
        super.description = "Cappucino";
        super.price = 10.0;
    }

    @Override
    public double getPrice() {
        return super.price;
    }
}
