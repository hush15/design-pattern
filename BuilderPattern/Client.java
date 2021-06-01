package BuilderPattern;

public class Client {
    public static void main(String[] args) {
        MealBuilder mb =new SubMealBuilderA();
        KFCWaiter waiter =new KFCWaiter();
        waiter.setMealBuilder(mb);
        Meal meal =waiter.construct();
        System.out.println("套餐是");
        System.out.println(meal.getFood());
        System.out.println(meal.getDrink());
    }
}
