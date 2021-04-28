package AFactory;

public class AConV implements AFruitAndVegetables{
    @Override
    public Fruit CreateF() {
        return null;
    }
    
    @Override
    public Vegetables CreateV() {
        
        return new tomato();
    }
}
