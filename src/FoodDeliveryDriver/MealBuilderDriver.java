package FoodDeliveryDriver;

import FoodDeliveryAppModel.FoodMenuModel;
import Ordering.MealBuilder;

import java.util.ArrayList;

import static java.lang.System.in;

/**
 * Created by Ishan on 1/21/2017.
 */
public class MealBuilderDriver {

    public double BuildMealForUser(ArrayList<FoodMenuModel> selectedMealItems)
    {
        double totalCost=0;
       System.out.println();
       System.out.println("You Selected Following Meal Items");
       System.out.println("__________________________________");
       MealBuilder mealBuilder = new MealBuilder();
       mealBuilder.PrepareMeal(selectedMealItems);
       mealBuilder.meal.ShowItems();
       totalCost=mealBuilder.meal.GetCost();
       System.out.println("Total Cost (INR) : "+ totalCost);

        return totalCost;
    }
}
