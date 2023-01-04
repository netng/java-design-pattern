package net.nandang.apps.patterns.javaBean;

import net.nandang.data.patterns.javaBean.NutritionFacts;

public class NutritionFactsApp {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts();
        nutritionFacts.setServingSize(240);
        nutritionFacts.setServings(8);
        nutritionFacts.setCalories(100);
        nutritionFacts.setSodium(35);
        nutritionFacts.setCarbohydrate(27);

        System.out.println(nutritionFacts);
    }
}
