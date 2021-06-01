package BuilderPattern;

public class SubMealBuilderB extends  MealBuilder{
    public  void  buildFood(){
       meal.setFood("鸡肉卷");
    }
    public  void  buildDrink(){
        meal.setDrink("果汁");
    }
}
