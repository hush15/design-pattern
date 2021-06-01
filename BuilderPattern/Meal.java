package BuilderPattern;

public class Meal {
    private String food ;
    private String drink;
    public void  setDrink(String drink){
        this.drink=drink;
    }
    public void  setFood(String food){
        this.food=food;
    }
    
    public String getDrink() {
        return (this.drink);
    }
    
    public String getFood() {
        return food;
    }
}
