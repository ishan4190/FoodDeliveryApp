package FoodDeliveryAppModel;

/**
 * Created by Ishan on 1/21/2017.
 */
public class RestaurantModel {

    private String restaurantId;
    private String name;
    private String address;
    private int rating;

    public RestaurantModel(String restaurantId, String name, String address, int rating)
    {
        setName(name);
        setRestaurantId(restaurantId);
        setAddress(address);
        setRating(rating);
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
