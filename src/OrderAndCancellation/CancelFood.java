package OrderAndCancellation;

/**
 * Created by Ishan on 1/21/2017.
 */
public class CancelFood implements IFoodOrderCommands {
    private Food food;
    public String OrderId;
    public CancelFood(Food food)
    {
        this.food=food;
    }

    @Override
    public void Execute() {
            food.CancelFood(this.OrderId);
    }
}
