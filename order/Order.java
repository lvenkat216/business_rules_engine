package business_rules_engine.order;
import java.util.*;
public class Order{
    private String productType;
    private String productName;
    private String userEmail;

    public Order(String productType, String productName, String userEmail){
        this.productType = productType;
        this.productName = productName;
        this.userEmail = userEmail;
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