package AFactory;

public class AConF implements AFruitAndVegetables {
    @Override
    public Fruit CreateF() {
        return new Apple();
    }

    @Override
    public Vegetables CreateV() {
        return null;
    }
}
