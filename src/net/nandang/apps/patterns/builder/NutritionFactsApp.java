package net.nandang.apps.patterns.builder;

import net.nandang.data.patterns.builder.NutritionFacts;

public class NutritionFactsApp {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(240, 8).calories(100)
                .sodium(35).carbohydrate(27).build();

        System.out.println(nutritionFacts);
    }
}
