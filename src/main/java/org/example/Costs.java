package org.example;
/*
 *User:t.me/abu_org tt:@abu_ed1t
 *Date:2/13/2024 *Time:5:40 PM
 */

import java.util.HashMap;

public class Costs {

    public static HashMap<Double,Double> RailWaySmallAmount = new HashMap<>();
    public static HashMap<Double,Double> RailWayBigAmount = new HashMap<>();

    public static HashMap<Double,Double> CarSmallAmount = new HashMap<>();
    public static HashMap<Double,Double> CarBigAmount = new HashMap<>();

    public static HashMap<Double,Double> AirWaySmallAmount = new HashMap<>();
    public static HashMap<Double,Double> AirWayBigAmount = new HashMap<>();
    public static void fill(){
        RailWaySmallAmount.put(150.0,170.0);
        RailWaySmallAmount.put(200.0,180.0);
        RailWaySmallAmount.put(300.0,200.0);
        RailWaySmallAmount.put(400.0,210.0);
        RailWaySmallAmount.put(500.0,240.0);
        RailWaySmallAmount.put(700.0,260.0);
        RailWaySmallAmount.put(900.0,310.0);
        RailWaySmallAmount.put(1000.0,360.0);

        //----------------------------\\
        double kg = 1500.0;
        double RailWayPrice = 0.35;
        for(int i = 0; i < 18; i++){
            RailWayBigAmount.put(kg, RailWayPrice);
            kg += 500;
            RailWayPrice += 0.05;
        }

        CarSmallAmount.put(150.0,140.0);
        CarSmallAmount.put(200.0,160.0);
        CarSmallAmount.put(300.0,180.0);
        CarSmallAmount.put(400.0,200.0);
        CarSmallAmount.put(500.0,220.0);
        CarSmallAmount.put(700.0,250.0);
        CarSmallAmount.put(900.0,280.0);
        CarSmallAmount.put(1000.0,320.0);

        //----------------------------\\
        kg = 1500.0;
        double CarPrice = 0.52;
        for(int i = 0; i < 18; i++){
            CarBigAmount.put(kg, CarPrice);
            kg += 500;
            CarPrice += 0.05;
        }

        //AirWaySmallAmount.put();

        //----------------------------\\
        kg = 1500.0;
        /*double AirPrice = ;
        for(int i = 0; i < 18; i++){
            AirWayBigAmount.put(kg, AirPrice);
            kg += 500;
            AirPrice += 0.05;
        }*/
    }



}

