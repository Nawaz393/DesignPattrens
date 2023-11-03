package GOF.Lab6.Builder;

public class MealBuilder {

   public Meal prepareVegMeal() {
      Meal meal = new Meal();
      meal.addItem(new VegBurger());
      meal.addItem(new Coke());
      return meal;
   }

   public Meal prepareNonVegMeal() {
      Meal meal = new Meal();
      meal.addItem(new ChickenBurger());
      meal.addItem(new Pepsi());
      meal.addItem(new SweetDecorater(new CreamDecorater(new Tea())));
      return meal;
   }
}