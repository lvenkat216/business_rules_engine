package business_rules_engine;
import business_rules_engine.business_rule_engine.OrderProcessor;
import business_rules_engine.order.Order;
import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String productType, productName, userEmail;
        System.out.println("Enter product type (physical/book/video/membership/upgrade): ");
        productType = s.nextLine().trim().toLowerCase();
        System.out.println("Enter title: ");
        productName = s.nextLine().trim().toLowerCase();
        System.out.println("Enter user email id: ");
        userEmail = s.nextLine().trim().toLowerCase();
        s.close();
        Order order = new Order(productName, productType, userEmail);
        OrderProcessor processor = new OrderProcessor();
        processor.process(order);
    }
}

