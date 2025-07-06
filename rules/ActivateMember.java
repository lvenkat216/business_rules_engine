package business_rules_engine.rules;
import business_rules_engine.order.Order;
public class ActivateMember {
    public void apply(Order order){
        System.out.println("Activated membership");
    }
}
