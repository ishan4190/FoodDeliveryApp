import FoodDeliveryAppModel.FoodMenuModel;
import FoodDeliveryAppModel.UserModel;
import FoodDeliveryDriver.*;

import java.util.ArrayList;

/**
 * Created by Ishan on 1/21/2017.
 */
public class Program {

    public static void main(String[] args) {
        //User Searches Restaurant.
        RestaurantSearchDriver restaurantSearchDriver = new RestaurantSearchDriver();
        String restaurantId = restaurantSearchDriver.RestaurantSearch();

        //User sees Food Menu Items based on the selected Restaurant Id.
        MealMenuIteratorDriver mealMenuIteratorDriver = new MealMenuIteratorDriver();
        ArrayList<FoodMenuModel> foodMenu = mealMenuIteratorDriver.PrintMealMenu(restaurantId);

        //Meal Selector. / User Selects Meal
        MealSelectorDriver mealSelectorDriver = new MealSelectorDriver();
        ArrayList<FoodMenuModel> selectedMealItems = mealSelectorDriver.MealSelectionByUser(foodMenu);

        //Calling Meal Builder/ Restaurant Builds meal
        MealBuilderDriver mealBuilderDriver = new MealBuilderDriver();
        double totalCost = mealBuilderDriver.BuildMealForUser(selectedMealItems);

        //User Orders Food
        String orderId = "";
        UserModel user = null;
        MealOrderDriver mealOrderDriver = new MealOrderDriver();
        String cancel = mealOrderDriver.MealOrderByUser(selectedMealItems, totalCost, restaurantId,  orderId,  user);

        //Order Tracking.
        OrderTrackingDriver orderTrackingDriver = new OrderTrackingDriver();
        orderTrackingDriver.OrderTrackingByUser(restaurantId, orderId, user, cancel);

    }
}
