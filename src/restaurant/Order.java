package restaurant;

import restaurant.chef.ChefFactory;
import restaurant.chef.Chef;

public class Order {
    public String placeOrder(String dishType){
        Chef chef = ChefFactory.getChef(dishType);
        if(chef != null){
          return chef.prepareDish();
        }
        return "Sorry, we can't serve that dish.";
    }
}
