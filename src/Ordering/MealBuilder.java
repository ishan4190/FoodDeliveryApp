package Ordering;

import FoodDeliveryAppModel.FoodMenuModel;

import java.util.ArrayList;

/**
 * Created by Ishan on 1/21/2017.
 */
public class MealBuilder {
     public Meal meal;
     public void PrepareMeal(ArrayList<FoodMenuModel> foodMenu)
     {
         meal =new Meal();
         meal.AddFoodItem(foodMenu);
     }
}
