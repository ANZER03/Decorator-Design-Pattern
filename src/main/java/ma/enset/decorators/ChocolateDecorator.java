package ma.enset.decorators;

import ma.enset.boisson.Boisson;

public class ChocolateDecorator extends BoisonDecorator{


    public ChocolateDecorator(Boisson boisson) {
        super.boisson = boisson;
        this.description = " au Chocolate";
        this.price = 1.5;
    }

    @Override
    public double getPrice() {
        return this.boisson.getPrice() + this.price;
    }

    @Override
    public String getDescription() {
        return this.boisson.getDescription() + this.description;
    }
}
