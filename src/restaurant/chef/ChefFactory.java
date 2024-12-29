package restaurant.chef;

import restaurant.chef.chefImpl.DalTikkadChef;
import restaurant.chef.chefImpl.PizzaChef;
import restaurant.chef.chefImpl.SamosaChef;

public class ChefFactory {
    public static Chef getChef(String dishType){
        switch (dishType.toLowerCase()){
            case "pizza" :
                return new PizzaChef();
            case "samosa" :
                return new SamosaChef();
            case "daltikkad":
                return new DalTikkadChef();
            default:
                return null;
        }
    }
}
