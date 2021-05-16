package com.concept.factorydesignpattern;

/**
 * Created by Kumar Vijay on 29/04/21.
 */

/**
 * GetPlanFactory to generate object of a concrete classes based on given information.
 */
public class GetPlanFactory {

    public Plan getPlan(String planType) {

        if (planType == null)
            return null;

        if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        }
        if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
            return new CommercialPlan();
        }
        if (planType.equalsIgnoreCase("INDUSTRIALPLAN")) {
            return new IndustrialPlan();
        }
        return null;
    }
}
