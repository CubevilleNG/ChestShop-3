package com.Acrobot.ChestShop.Config;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Acrobot
 */
public enum DefaultLanguage {
    prefix("&a[Shop] &f"),
    iteminfo("&aItem Information:&f"),
    options("&aCustomizable options: "),

    ACCESS_DENIED("You don't have permission to do that!"),

    NOT_ENOUGH_MONEY("You have got not enough money!"),
    NOT_ENOUGH_MONEY_SHOP("Shop owner doesn't have enough money!"),

    NO_BUYING_HERE("You can't buy here!"),
    NO_SELLING_HERE("You can't sell here!"),

    NOT_ENOUGH_SPACE_IN_INVENTORY("You haven't got enough space in inventory!"),
    NOT_ENOUGH_SPACE_IN_CHEST("There isn't enough space in chest!"),
    NOT_ENOUGH_ITEMS_TO_SELL("You have got not enough items to sell!"),

    NOT_ENOUGH_STOCK("This shop has not enough stock."),
    NOT_ENOUGH_STOCK_IN_YOUR_SHOP("Your %material shop is out of stock!"),

    YOU_BOUGHT_FROM_SHOP("You bought %amount %item from %owner for %price."),
    SOMEBODY_BOUGHT_FROM_YOUR_SHOP("%buyer bought %amount %item for %price from you."),

    YOU_SOLD_TO_SHOP("You sold %amount %item to %buyer for %price."),
    SOMEBODY_SOLD_TO_YOUR_SHOP("%seller sold %amount %item for %price to you."),

    YOU_CANNOT_CREATE_SHOP("You can't create this type of shop!"),
    NO_CHEST_DETECTED("Couldn't find a chest!"),
    ANOTHER_SHOP_DETECTED("Another player's shop detected!"),

    PROTECTED_SHOP("Successfully protected the shop!"),
    SHOP_CREATED("Shop successfully created!"),

    INCORRECT_ITEM_ID("You have specified invalid item id!");


    private String text;
    private static final Map<String, DefaultLanguage> names = new HashMap<String, DefaultLanguage>();

    private DefaultLanguage(String def) {
        text = def;
    }

    public String toString() {
        return text;
    }

    public static DefaultLanguage lookup(String name) {
        return names.get(name);
    }

    static {
        for (DefaultLanguage def : values()) {
            names.put(def.name(), def);
        }
    }
}
