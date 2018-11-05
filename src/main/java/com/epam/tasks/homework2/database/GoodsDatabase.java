package com.epam.tasks.homework2.database;

import com.epam.tasks.homework2.model.Appliance;
import com.epam.tasks.homework2.model.Food;
import com.epam.tasks.homework2.model.appliances.*;
import com.epam.tasks.homework2.model.foods.*;

import java.util.ArrayList;
import java.util.List;

public class GoodsDatabase {

    public List<Appliance> getAllAppliancesList(){
        List<Appliance> appliancesList = new ArrayList<>();
        appliancesList.add(new Sony(100));
        appliancesList.add(new Samsung(80));
        appliancesList.add(new Sharp(70));
        appliancesList.add(new Apple(300));
        appliancesList.add(new Aser(40));
        return appliancesList;
    }

    public List<Food> getAllFoodsList(){
        List<Food> foodsList = new ArrayList<>();
        foodsList.add(new Bread(110));
        foodsList.add(new Sausage(80));
        foodsList.add(new Butter(70));
        foodsList.add(new Milk(300));
        foodsList.add(new Potato(40));
        return foodsList;
    }
}
