package AFactory;

import AFactory.Vegetables;

public class BConV implements BFruitAndVegetables {
    @Override
    public Fruit CreateF() {
        return null;
    }

    @Override
    public Vegetables CreateV() {
        return  new cabbage();
    }
}
