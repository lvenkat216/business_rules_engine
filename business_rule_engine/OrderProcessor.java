package business_rules_engine.business_rule_engine;
import business_rules_engine.order.Order;
import business_rules_engine.rules.*;
public class OrderProcessor{
    public void process(Order order){
        if(order.getType().equals("physical")){
            ShippingPackingSlip ob = new ShippingPackingSlip();
            Commision ob2 = new Commision();
            ob.apply(order);
            ob2.apply(order);
        }
        if(order.getType().equals("book")){
            Duplicate ob = new Duplicate();
            Commision ob2 = new Commision();
            ob.apply(order);
            ob2.apply(order);
        }
        if(order.getType().equals("membership")){
            ActivateMember ob = new ActivateMember();
            Email ob2 = new Email();
            ob.apply(order);
            ob2.apply(order);
        }
        if(order.getType().equals("upgrade")){
            UpgradeMember ob = new UpgradeMember();
            Email ob2 = new Email();
            ob.apply(order);
            ob2.apply(order);
        }
        if(order.getName().equals("learning to ski")){
            Video ob = new Video();
            ob.apply(order);
        }
    }
}