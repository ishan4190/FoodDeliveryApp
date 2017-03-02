package FoodDeliveryDriver;

import FoodDeliveryAppModel.FoodMenuModel;
import FoodDeliveryAppModel.UserModel;
import OrderAndCancellation.CancelFood;
import OrderAndCancellation.Customer;
import OrderAndCancellation.Food;
import OrderAndCancellation.OrderFood;

import java.io.Console;
import java.util.ArrayList;

/**
 * Created by Ishan on 1/21/2017.
 */
public class MealOrderDriver {
    public String MealOrderByUser(ArrayList<FoodMenuModel> selectedMealItems, double totalCost, String restaurantId, String orderId, UserModel user)
    {
        System.out.println("");
        System.out.println("Do you want to place order(y/n)...?");
        String wantsOrder = System.console().readLine();
        System.out.println("");

        orderId ="";
        user = null;

        if (wantsOrder.equals('y'))
        {
            System.out.println("_________________________");
            Food food = new Food();
            OrderFood orderFood = new OrderFood(food);
            orderFood.FoodItems = selectedMealItems;
            orderFood.User = new UserModel();
            orderFood.User.setUserId("gul123");
            orderFood.User.setUserName("Gul Ershad");
            orderFood.User.setAddress("JP Nangar, Bangalore - 5600076");
            orderFood.User.setPhoneNumber("99998987");
            orderFood.User.setAmount(totalCost);
            orderFood.RestaurantId = restaurantId;
            user = orderFood.User;
            Customer customer = new Customer();
            customer.TakeOrder(orderFood);
            customer.PlaceOrders();
            orderId = orderFood.OrderId;
            System.out.println("");
        }

        //Order Cancellation.
        String cancel = "n";
        if (!(orderId.isEmpty()))
        {
            System.out.println("Do you want to cancel order(y/n)...?");
             cancel = System.console().readLine();


            if (cancel.equals("y"))
            {

                Food food = new Food();
                CancelFood cancelOrder = new CancelFood(food);
                cancelOrder.OrderId = orderId;
                Customer customer = new Customer();
                customer.TakeOrder(cancelOrder);
                customer.PlaceOrders();
            }
        }

        return cancel;
    }
}
