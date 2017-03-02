package FoodDeliveryAppModel;
import java.util.*;

/**
 * Created by Ishan on 1/21/2017.
 */
public class FoodMenuModel {

    private String restaurantId;
    private String foodId;
    private String foodName;
    private String cuisine;
    private double rate;
    private int rating;

    public FoodMenuModel(String restaurantId, String foodId, String foodName, String cuisine, double rate, int rating)
    {
        setRestaurantId(restaurantId);
        setFoodId(foodId);
        setCuisine(cuisine);
        setFoodName(foodName);
        setRate(rate);
        setRating(rating);
    }
    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
