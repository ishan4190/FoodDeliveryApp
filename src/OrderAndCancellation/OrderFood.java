package OrderAndCancellation;

import FoodDeliveryAppModel.FoodMenuModel;
import FoodDeliveryAppModel.UserModel;

import java.util.ArrayList;

/**
 * Created by Ishan on 1/21/2017.
 */
public class OrderFood implements IFoodOrderCommands {

    private Food food;
    public ArrayList<FoodMenuModel> FoodItems;
    public UserModel User;
    public String OrderId;
    public String RestaurantId;

    public OrderFood(Food food)
    {
        this.food = food;
    }

    @Override
    public void Execute() {
        OrderId = food.OrderFood(RestaurantId,User);
    }
}
