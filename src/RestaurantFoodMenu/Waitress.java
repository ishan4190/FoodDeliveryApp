package RestaurantFoodMenu;

import FoodDeliveryAppModel.FoodMenuModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ishan on 1/21/2017.
 */
public class Waitress {

    private String restaurantId;
    FoodMenu foodMenu;
    public Waitress(String restaurantId)
    {
        this.restaurantId = restaurantId;
    }

    public ArrayList<FoodMenuModel> PrintFoodMenu()
    {
        foodMenu = new FoodMenu(restaurantId);

        IIterator restaurantFoodMenu= foodMenu.CreateFoodMenuIterator();
        return PrintFoodMenu(restaurantFoodMenu);
    }

    private ArrayList<FoodMenuModel> PrintFoodMenu(IIterator iterator)
    {
        System.out.println("Food Menu");
        System.out.println("**************************************");
        System.out.println();

        ArrayList<FoodMenuModel> foodMenu = new ArrayList<>();
        while(iterator.HasNext())
        {
            FoodMenuModel foodMenuItem = (FoodMenuModel)iterator.Next();
            foodMenu.add(foodMenuItem);

            System.out.println("Restaurant ID : "+ foodMenuItem.getRestaurantId());
            System.out.println("Food ID : " +foodMenuItem.getFoodId());
            System.out.println("Food Name : " + foodMenuItem.getFoodName());
            System.out.println("Couisine : " + foodMenuItem.getCuisine());
            System.out.println("Rate(Rs.) : " + foodMenuItem.getRate());
            System.out.println("Rating : "+ foodMenuItem.getRating());
            System.out.println("____________________________");
            System.out.println();

        }

        return foodMenu;
    }
}
