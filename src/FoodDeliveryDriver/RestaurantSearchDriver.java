package FoodDeliveryDriver;

import FoodDeliveryAppModel.RestaurantModel;
import RestaurantSearch.InterpretContext;
import RestaurantSearch.RestaurantSearchClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Ishan on 1/21/2017.
 */
public class RestaurantSearchDriver {

    public String RestaurantSearch()
    {
        InterpretContext context = new InterpretContext("Some API");
        RestaurantSearchClient client = new RestaurantSearchClient(context);
        System.out.println("Search Restaurant(by Location)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Location:");
        String location = null;
        try {
            location = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String searchSentence = location;//String.Format("restaurant by location '{0}'" + location);
        ArrayList<RestaurantModel> result = client.Intercept(searchSentence);
        if (result.isEmpty())
            System.out.println("Sorry, No Restaurants available in this location.");

        String restaurantId = null;

        if (!result.isEmpty())
        {
            System.out.println("List of Restaurants");
            System.out.println("*******************");

            for (RestaurantModel r :result)
            {
                System.out.println(" ");
                System.out.println( r.getRestaurantId()+" "+ r.getName());
                System.out.println(r.getAddress());
                int rating = r.getRating();
                System.out.println("Rating: ");
                while (rating > 0)
                {
                    System.out.println("*");
                    rating--;
                }

                System.out.println();
                System.out.println("_________________________________");
            }

            System.out.println();
            System.out.println("Please Select Restaurant by Id: ");
            restaurantId = System.console().readLine();
        }

        return restaurantId;
    }
}
