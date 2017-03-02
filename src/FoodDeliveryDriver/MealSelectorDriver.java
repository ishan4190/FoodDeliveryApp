package FoodDeliveryDriver;

import FoodDeliveryAppModel.FoodMenuModel;

import java.util.ArrayList;

/**
 * Created by Ishan on 1/21/2017.
 */
public class MealSelectorDriver {

    public ArrayList<FoodMenuModel> MealSelectionByUser(ArrayList<FoodMenuModel> foodMenu)
    {
        //Meal Selector.


        System.out.println("Please select the food items");
        System.out.println("_________________________");

        ArrayList<FoodMenuModel> selectedMealItems = new ArrayList<FoodMenuModel>();
        String answer;
        do
        {
            System.out.println("Enter food Id:");
            String foodId = System.console().readLine();
            FoodMenuModel foodItem=null;

            for(FoodMenuModel food: foodMenu) {
                if(food.getFoodId().contains(foodId))
                    foodItem= new FoodMenuModel(food.getRestaurantId(),food.getFoodId(),food.getFoodName(),food.getCuisine(),
                            food.getRate(),food.getRating());

            }
            if (foodItem != null)
            {
                System.out.println("You Selected Below food Item:");
                System.out.println("------------------------------");
                System.out.println("Name: " + foodItem.getFoodName());
                System.out.println("Rate(Rs.): "+ foodItem.getRate());
                System.out.println("Rating: "+ foodItem.getRating());
                selectedMealItems.add(foodItem);
            }
            else
                System.out.println("Invalid Food Id Selected. No food Item available with this Id.");

            System.out.println();

            System.out.println("Do you want to add more food item(y/n):...?");
            answer = System.console().readLine();
            System.out.println();

        } while (answer != "n");

        return selectedMealItems;
    }
}
