package com.epam.tasks.homework2.husband.impl;

import com.epam.tasks.homework2.database.GoodsDatabase;
import com.epam.tasks.homework2.model.Appliance;
import com.epam.tasks.homework2.model.Food;
import com.epam.tasks.homework2.model.Good;
import com.epam.tasks.homework2.model.appliances.Samsung;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class HusbandImplTest {

    @Test
    public void getGoodsList() {
        HusbandImpl husband = new HusbandImpl();
        List<Good> goodsList = husband.getGoodsList();

        List<Good> answer = new ArrayList<>();
        GoodsDatabase goodsDatabase = new GoodsDatabase();
        List<Appliance> allAppliancesList = goodsDatabase.getAllAppliancesList();
        List<Food> allFoodsList = goodsDatabase.getAllFoodsList();
        answer.addAll(allAppliancesList);
        answer.addAll(allFoodsList);

        assertEquals(answer, goodsList);
    }

    @Test
    public void getGoodsListByRequiredList() {
        List<String> requiredList = new ArrayList<>();
        requiredList.add("Samsung");

        HusbandImpl husband = new HusbandImpl();
        List<Good> goodsListByRequiredList = husband.getGoodsListByRequiredList(requiredList);

        List<Good> answer = new ArrayList<>();
        answer.add(new Samsung(80));

        assertEquals(answer, goodsListByRequiredList);
    }

    @Test
    public void getTotalePriceByRequiredList() {
        List<String> requiredList = new ArrayList<>();
        requiredList.add("Samsung");

        HusbandImpl husband = new HusbandImpl();
        long totalePriceByRequiredList = husband.getTotalePriceByRequiredList(requiredList);

        assertEquals(new Samsung(80).getPrice(), totalePriceByRequiredList);
    }
}