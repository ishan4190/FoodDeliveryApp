package FoodDeliveryDriver;

import FoodDeliveryAppModel.FoodMenuModel;
import RestaurantFoodMenu.FoodMenu;
import RestaurantFoodMenu.Waitress;

import java.util.ArrayList;

/**
 * Created by Ishan on 1/21/2017.
 */
public class MealMenuIteratorDriver {
    public ArrayList<FoodMenuModel> PrintMealMenu(String restaurantId)
    {
        Waitress waitress = new Waitress(restaurantId);
       ArrayList<FoodMenuModel> foodMenu = waitress.PrintFoodMenu();
        return foodMenu;
    }
}
