package day8;

import java.util.logging.Logger;

public class ShoppingMall {

    public static void main(String[] args) {

        Door.setCount(Door.getCount() + 1);

        Door.setCount(Door.getCount() - 1);

        Logger.getGlobal().info(String.valueOf(Door.getCount()));

    }
}
