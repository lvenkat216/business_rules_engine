package business_rules_engine.rules;
import business_rules_engine.order.Order;
public class Video{
    public void apply(Order order){
        System.out.println("Added free First Aid video to the packing slip");
    }
}
