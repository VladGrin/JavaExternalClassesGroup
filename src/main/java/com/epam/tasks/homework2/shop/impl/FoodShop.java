package com.epam.tasks.homework2.shop.impl;

import com.epam.tasks.homework2.database.GoodsDatabase;
import com.epam.tasks.homework2.model.Food;
import com.epam.tasks.homework2.shop.Shop;

import java.util.List;

public class FoodShop implements Shop {

    private GoodsDatabase goodsDatabase = new GoodsDatabase();

    @Override
    public List<Food> getGoodList() {
        return goodsDatabase.getAllFoodsList();
    }
}
