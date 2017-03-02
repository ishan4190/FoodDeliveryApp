package OrderAndCancellation;

import FoodDeliveryAppModel.UserModel;

/**
 * Created by Ishan on 1/21/2017.
 */
public class Food {

    public String OrderFood( String restaurantId, UserModel user)
    {
        String orderId = restaurantId;
        System.out.println("Order ID: "+ orderId);
        System.out.println("Customer Name :" + user.getUserName());
        System.out.println("Mobile : " + user.getPhoneNumber());
        System.out.println("User ID : "+ user.getUserId());
        System.out.println("Address : "+ user.getAddress());
        System.out.println("Amount(Rs.): "+ user.getAmount());
        System.out.println("Food Ordered");
        return orderId;
    }

    public void CancelFood(String orderId)
    {
        System.out.println("Food Order with Order ID "+orderId+" has been cancelled.");
    }
}
