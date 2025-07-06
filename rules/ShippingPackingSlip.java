package business_rules_engine.rules;
import business_rules_engine.order.Order;
public class ShippingPackingSlip implements OrderRule{
    public void apply(Order order){
        System.out.println("Generated a packing slip for type: "+order.getType());
    }
  
}
