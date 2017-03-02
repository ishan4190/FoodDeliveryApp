
package Ordering;
import FoodDeliveryAppModel.FoodMenuModel;

import java.util.*;
/**
 * Created by Ishan on 1/21/2017.
 */
public class Meal {
    private ArrayList<FoodMenuModel> foodItems = new ArrayList();
   // private List<FoodMenuModel> foodItems = new List<FoodMenuModel>();

    public void AddFoodItem(ArrayList<FoodMenuModel> items)
    {
        foodItems.addAll(items);
    }

    public double GetCost()
    {
        double cost =0;

        for (FoodMenuModel item :foodItems)
             {
                 cost+=item.getRate();
             }

             return cost;
    }

    public void ShowItems()
    {
        for (FoodMenuModel item: foodItems) {

          System.out.println("Food Id :" + item.getFoodId());
          System.out.println("Food Name :" + item.getFoodName());
          System.out.println("Food Price :" + item.getRate());
          System.out.println("Food Rating :" + item.getRating());
          System.out.println("-----------------------------------");

        }


    }


}
