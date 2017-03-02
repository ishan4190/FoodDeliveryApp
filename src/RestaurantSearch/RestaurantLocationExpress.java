package RestaurantSearch;

import FoodDeliveryAppModel.RestaurantModel;

import java.util.ArrayList;

/**
 * Created by Ishan on 1/21/2017.
 */
public class RestaurantLocationExpress extends AbstractExpression {

    private String searchString;

    public RestaurantLocationExpress(String searchString)
    {
        this. searchString = searchString;
    }

    @Override
    public ArrayList<RestaurantModel> Interpret(InterpretContext context) {

        ArrayList<RestaurantModel> restaurants = context.GetAllRestaurants();
       // ArrayList<RestaurantModel> restaurantResult = new ArrayList<>();

        ArrayList<RestaurantModel> result = new ArrayList<>();

               for(RestaurantModel r :restaurants)
               {
                   if(r.getAddress().contains(this.searchString))
                       result.add(r);
               }



        return result;
    }
}
