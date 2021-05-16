package com.concept.factorydesignpattern;

/**
 * Created by Kumar Vijay on 29/04/21.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Generate bill by using the GetPlanFactory to get object of concrete classes by passing the information such as as type of plan
 * DOMESTICPLAN or COMMERCIALPLAN or INSTITUTIONALPLAN.
 */
public class GenerateBill {
    public static void main(String[] args) throws IOException {
        //user input for plan type
        System.out.println("Enter the name of plan:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String planType = br.readLine();

        //user input for number of units
        System.out.println("Please enter the number of unit:");
        int unit = Integer.parseInt(br.readLine());

        System.out.println("Calculating bill for " + planType + " ,no of unit is " + unit);

        GetPlanFactory planFactory = new GetPlanFactory();
        Plan plan = planFactory.getPlan(planType);

        plan.getRate();
        plan.calculateBill(unit);
    }
}
