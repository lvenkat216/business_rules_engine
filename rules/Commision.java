package business_rules_engine.rules;
import business_rules_engine.order.Order;
public class Commision {
    public void apply(Order order){
        System.out.println("Generated a commison payment for"+order.getType());
    }
}
