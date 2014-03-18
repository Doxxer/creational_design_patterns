package ru.spbau.sd.designpatterns;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: avoskobovitch
 * Date: 18.03.14
 * Time: 20:53
 */
public class Bartender {
    private Map<String, Receipt> receiptMap;

    //Introduce class for ingredient portion and implement three receipts
    public Cocktail makeCocktail(String name) {
        Receipt receipt = receiptMap.get(name);
        Cocktail cocktail = new Cocktail();
        cocktail.setGlass(/*glass object here*/);
        cocktail.addAlcoPortion(/*ingridient portion object here*/);
        cocktail.addNonAlcoPortion(/*ingridient portion object here*/);
        cocktail.addStraw();
        return cocktail;
    }
}