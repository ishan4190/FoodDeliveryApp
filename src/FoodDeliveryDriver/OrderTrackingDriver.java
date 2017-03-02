package FoodDeliveryDriver;

import FoodDeliveryAppModel.UserModel;
import Tracking.Customers;
import Tracking.Restaurant;

/**
 * Created by Ishan on 1/21/2017.
 */
public class OrderTrackingDriver {
    public void OrderTrackingByUser(String restaurantId, String orderId, UserModel user, String cancel)
    {
        //Order Tracking.
        if (cancel != "y")
        {
           System.out.println();
            System.out.println("Food Delivery Status");
            System.out.println("---------------------");

            Restaurant restaurant = new Restaurant(restaurantId, orderId, "Order Received");
            restaurant.Attach(new Customers(user));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            restaurant.setDeliveryStatus("Dispatched");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            restaurant.setDeliveryStatus("On the way.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            restaurant.setDeliveryStatus("Near your home");
            restaurant.setDeliveryStatus("Delivered");
        }

        System.console().readLine();
    }
}
