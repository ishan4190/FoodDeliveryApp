package Tracking;

import FoodDeliveryAppModel.UserModel;

/**
 * Created by Ishan on 1/21/2017.
 */
public class Customers implements  ICustomers {

    private UserModel userModel;
    private Restaurant restaurant;

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Customers(UserModel userModel)
    {
        this.userModel = userModel;
    }
    @Override
    public void Update(FoodDelivery foodDelivery) {
        System.out.println("Notified Restaurant ID "+ foodDelivery.getRestaurantId() +"of Order ID 's"+ "Food Delivery Status"+
                foodDelivery.getDeliveryStatus());
        System.out.println("Date Time: "+ foodDelivery.getDeliveryTime());
    }
}
