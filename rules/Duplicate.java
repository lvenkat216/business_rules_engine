package business_rules_engine.rules;
import business_rules_engine.order.Order;
public class Duplicate {
    public void apply(Order order){
        System.out.println("Generated a duplicate packing slip for royatlty department for"+order.getType());
    }
}
