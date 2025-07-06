package business_rules_engine.rules;
import business_rules_engine.order.Order;

public class Email {
    public void apply(Order order){
        System.out.println("Sent an email regarding"+order.getType()+"to"+order.getEmail());
    }
}
