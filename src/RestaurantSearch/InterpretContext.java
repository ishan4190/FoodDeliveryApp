package RestaurantSearch;

import FoodDeliveryAppModel.FoodMenuModel;
import FoodDeliveryAppModel.RestaurantModel;
import RestaurantWebService.RestaurantService;

import java.util.ArrayList;

/**
 * Created by Ishan on 1/21/2017.
 */
public class InterpretContext {
    private RestaurantService restaurantService;
    public InterpretContext(String endPoint)
    {
        restaurantService = new RestaurantService(endPoint);
    }

    public ArrayList<RestaurantModel> GetAllRestaurants(){
        return restaurantService.GetAllRestaurants();
    }
}
