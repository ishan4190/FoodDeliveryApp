package RestaurantFoodMenu;

import FoodDeliveryAppModel.FoodMenuModel;

import java.util.ArrayList;

/**
 * Created by Ishan on 1/21/2017.
 */
public class RestaurantFoodMenuIterator implements IIterator {

    ArrayList<FoodMenuModel> items;
    int position=0;
    public RestaurantFoodMenuIterator(ArrayList<FoodMenuModel> items)
    {
        this.items=items;
    }
    @Override
    public boolean HasNext() {
        if(position>=items.size() || items.get(position)==null)
        return false;
        else
            return true;
    }

    @Override
    public Object Next() {
        FoodMenuModel menuItem = items.get(position);
        position= position+1;
        return menuItem;
    }
}
