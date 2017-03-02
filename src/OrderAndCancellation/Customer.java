package OrderAndCancellation;

import java.util.ArrayList;

/**
 * Created by Ishan on 1/21/2017.
 */
public class Customer {

    ArrayList<IFoodOrderCommands> orderList = new ArrayList<IFoodOrderCommands>();

    public void TakeOrder(IFoodOrderCommands order)
    {
        orderList.add(order);
    }

    public void PlaceOrders()
    {
        for (IFoodOrderCommands order : orderList)
        {
            order.Execute();
        }

        orderList.clear();
    }
}
