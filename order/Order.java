package business_rules_engine.order;
import business_rules_engine.business_rule_engine.*;
public class Order{
    private String productType;
    private String productName;
    private String userEmail;

    public Order(String productType, String productName, String userEmail){
        this.productType = productType;
        this.productName = productName;
        this.userEmail = userEmail;
    
        OrderProcessor od = new OrderProcessor();
        od.process(this);
    }
    public String getType(){
        return productType;
    }
    public String getName(){
        return productName;
    }
    public String getEmail(){
        return userEmail;
    }

}