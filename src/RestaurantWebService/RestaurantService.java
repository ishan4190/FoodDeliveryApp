package RestaurantWebService;

import FoodDeliveryAppModel.RestaurantModel;

import java.util.ArrayList;

/**
 * Created by Ishan on 1/21/2017.
 */
public class RestaurantService {

    public RestaurantService(String endPoint)
    {

    }

    public ArrayList<RestaurantModel> GetAllRestaurants()
    {
        ArrayList<RestaurantModel> restaurants= new ArrayList<>();
        restaurants.add(new RestaurantModel ("001", "Barbequnation", "JP Nagar, Bangalore 56006", 5 ));
        restaurants.add(new RestaurantModel ("002", "Paradize", "Kormangala",  3));
        restaurants.add(new RestaurantModel ("003", "Thirteenth floor", "Brigate Road", 4 ));
        restaurants.add(new RestaurantModel ("004",  "Mango Tree", "JP Nagar, Bangalore 560009", 2 ));
        restaurants.add(new RestaurantModel ("005", "Brewsky", "JP Nagar, Bangalore 564555",  4));
        return restaurants;
    }
}
