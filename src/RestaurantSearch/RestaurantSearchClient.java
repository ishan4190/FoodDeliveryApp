package RestaurantSearch;

import FoodDeliveryAppModel.RestaurantModel;

import java.util.ArrayList;

/**
 * Created by Ishan on 1/21/2017.
 */
public class RestaurantSearchClient {

    private InterpretContext context;

    public RestaurantSearchClient(InterpretContext context)
    {
        this.context = context;
    }

    public ArrayList<RestaurantModel> Intercept(String expression)
    {
        AbstractExpression queryExpression = null;
        String[] stringParts = expression.split(" ");
        String searchType = stringParts[0];
        String searchAttribute = stringParts[2];

        int startIndex = expression.indexOf("'");
        int lastIndex = expression.lastIndexOf("'");
        int length = expression.length();
        String query = expression.substring(startIndex+1, lastIndex - startIndex-1);

        if (searchType.equals("restaurant") && searchAttribute.equals("location"))
            queryExpression = new RestaurantLocationExpress(query);

        if (queryExpression != null)
            return queryExpression.Interpret(this.context);

        return null;
    }
}
