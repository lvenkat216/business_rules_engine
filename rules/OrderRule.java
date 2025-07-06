package business_rules_engine.rules;
import business_rules_engine.order.Order;
public interface OrderRule {
    void apply(Order order);
}
