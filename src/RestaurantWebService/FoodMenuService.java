package RestaurantWebService;
import FoodDeliveryAppModel.FoodMenuModel;

import java.util.*;

/**
 * Created by Ishan on 1/21/2017.
 */
public class FoodMenuService {

    public FoodMenuService( String endPoint, String restaurantIDd)
    {

    }

    public  ArrayList<FoodMenuModel> getAllFoodMenu(String restaurantId)
    {
        ArrayList<FoodMenuModel> foodMenu = new ArrayList<>();
        foodMenu.add(new FoodMenuModel("001","001","Indian","Chicken Biryani",250,5));
        foodMenu.add(new FoodMenuModel("001","002","Indian","Chicken Korma",300,4));
        foodMenu.add(new FoodMenuModel("001","003","Indian","Shahi Paneer",250,5));
        foodMenu.add(new FoodMenuModel("001","004","Indian","Tandoori Roti",250,3));
        foodMenu.add(new FoodMenuModel("001","005","Indian","Choley Bhaturey",100,5));

        return foodMenu;
    }
}
