package RestaurantFoodMenu;

import FoodDeliveryAppModel.FoodMenuModel;
import RestaurantWebService.FoodMenuService;

import java.util.ArrayList;

/**
 * Created by Ishan on 1/21/2017.
 */
public class FoodMenu implements IFoodMenu {

    private String restaurantId;
    public FoodMenu(String restaurantId)
    {
      this.restaurantId=restaurantId;
    }

    public ArrayList<FoodMenuModel> GetFoodMenuItems()
    {
        FoodMenuService foodMenuService = new FoodMenuService("",restaurantId);
        ArrayList<FoodMenuModel> foodMenuItems = foodMenuService.getAllFoodMenu(restaurantId);
        return foodMenuItems;
    }
    @Override
    public IIterator CreateFoodMenuIterator() {
        ArrayList<FoodMenuModel> foodMenuItems= GetFoodMenuItems();

        return new RestaurantFoodMenuIterator(foodMenuItems);
    }
}
