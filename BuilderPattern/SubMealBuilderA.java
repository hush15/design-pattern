package BuilderPattern;

public class SubMealBuilderA extends  MealBuilder{
    public  void  buildFood(){
        meal.setFood("鸡腿堡");
    }
    public  void  buildDrink(){
        meal.setDrink("可乐");
    }
}
