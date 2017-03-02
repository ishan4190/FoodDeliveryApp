package Tracking;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Ishan on 1/21/2017.
 */
public abstract class FoodDelivery {

    private ArrayList<ICustomers> _customers = new ArrayList<>();
    private String orderId;
    private String restaurantId;
    private String deliveryStatus;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }
    //public Date DeliveryTime;

    public LocalDateTime getDeliveryTime() {
        return LocalDateTime.now();
    }



    public void setDeliveryStatus(String deliveryStatus) {
        if(this.deliveryStatus != deliveryStatus);
        {
            this.deliveryStatus = deliveryStatus;
            Notify();
        }
    }

    public FoodDelivery(String restaurantId, String orderId, String deliveryStatus)
    {
        this.restaurantId = restaurantId;
        this.orderId = orderId;
        this.deliveryStatus = deliveryStatus;
    }

    public void Attach(ICustomers customer)
    {
        _customers.add(customer);
    }

    public void Notify()
    {
        for(ICustomers customer : _customers)
        {
            customer.Update(this);
        }

        System.out.println("");
    }
}
