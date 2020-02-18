package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.food2door.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.OrderRequest;

public class MainChallengesFood2Door {
    public static void main(String[] args){
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        OrderRequest orderRequest = extraFoodShop.process();
    }
}
