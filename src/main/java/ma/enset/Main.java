package ma.enset;

import ma.enset.boisson.Boisson;
import ma.enset.boisson.Cappucino;
import ma.enset.boisson.Espresso;
import ma.enset.decorators.CaramelDecorator;
import ma.enset.decorators.ChocolateDecorator;

public class Main {
    public static void main(String[] args) {

        Boisson b = new Espresso();
        b = new ChocolateDecorator(b);
        System.out.println(b.getDescription());
        System.out.println(b.getPrice());

        b = new CaramelDecorator(b);
        System.out.println("###############");

        System.out.println(b.getDescription());
        System.out.println(b.getPrice());

    }
}