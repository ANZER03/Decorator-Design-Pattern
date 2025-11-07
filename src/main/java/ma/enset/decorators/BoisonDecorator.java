package ma.enset.decorators;

import ma.enset.boisson.Boisson;

public abstract class BoisonDecorator extends Boisson {

    protected Boisson boisson;
    public BoisonDecorator() {};
    public abstract double getPrice();
}
