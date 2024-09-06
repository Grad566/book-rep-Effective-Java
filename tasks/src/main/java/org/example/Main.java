package org.example;

import org.example.createAndDestroyObjects.FabricMethood;
import org.example.createAndDestroyObjects.NutritionFacts;

public class Main {
    public static void main(String[] args) {
        var a = new NutritionFacts.Builder(1, 2)
                .carbohydrate(5).calories(2).build();
        System.out.println();
    }
}