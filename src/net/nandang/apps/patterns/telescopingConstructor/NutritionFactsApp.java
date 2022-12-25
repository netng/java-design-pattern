package net.nandang.apps.patterns.telescopingConstructor;

import net.nandang.data.patterns.telescopingConstructor.NutritionFacts;

public class NutritionFactsApp {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts(240, 8, 0, 35, 27);
        NutritionFacts nutritionFacts2 = new NutritionFacts(240, 8, 0, 35);
        System.out.println(nutritionFacts);
        System.out.println(nutritionFacts2);
    }
}
