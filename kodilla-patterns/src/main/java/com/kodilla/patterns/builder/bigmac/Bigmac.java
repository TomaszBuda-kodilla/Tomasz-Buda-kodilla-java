package com.kodilla.patterns.builder.bigmac;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final String bun;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder{
        private String bun;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun){
            this.bun = bun;
            return this;
        }
        public BigmacBuilder sauce(String sauce){
            this.sauce = sauce;
            return this;
        }
        public BigmacBuilder ingredient(String ingredient){
            ingredients.add(ingredient);
            return this;
        }
        public Bigmac build(){
            return new Bigmac(bun,sauce,ingredients);
        }
    }
    public Bigmac(final String bun, final String sauce, List<String> ingredients) {
        this.bun = bun;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
