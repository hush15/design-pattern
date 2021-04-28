package AFactory;

import AFactory.Vegetables;

public class BConF implements BFruitAndVegetables {
    @Override
    public Fruit CreateF() {
        return new Banana();
    }

    @Override
    public Vegetables CreateV() {
        return null;
    }
}
