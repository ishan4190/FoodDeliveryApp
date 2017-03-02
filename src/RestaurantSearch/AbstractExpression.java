package RestaurantSearch;

import FoodDeliveryAppModel.RestaurantModel;

import java.util.ArrayList;

/**
 * Created by Ishan on 1/21/2017.
 */
public abstract class AbstractExpression {

    public abstract ArrayList<RestaurantModel> Interpret(InterpretContext context);
}
