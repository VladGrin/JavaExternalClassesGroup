package com.epam.tasks.homework2.shop.impl;

import com.epam.tasks.homework2.database.GoodsDatabase;
import com.epam.tasks.homework2.model.Appliance;
import com.epam.tasks.homework2.shop.Shop;

import java.util.List;

public class ApplianceShop implements Shop {

    private GoodsDatabase goodsDatabase = new GoodsDatabase();

    @Override
    public List<Appliance> getGoodList() {
        return goodsDatabase.getAllAppliancesList();
    }
}
