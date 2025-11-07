package ma.enset.decorators;


import ma.enset.boisson.Boisson;

public class CaramelDecorator extends BoisonDecorator {

    public CaramelDecorator(Boisson boisson) {
        this.boisson = boisson;
        this.price = 2.0;
        this.description = " au Caramel";
    }

    @Override
    public double getPrice() {
        return this.boisson.getPrice()  + this.price;
    }

    @Override
    public String getDescription() {
        return this.boisson.getDescription() + this.description;
    }
}
