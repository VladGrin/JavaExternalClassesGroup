package com.epam.tasks.homework2.husband.impl;

import com.epam.tasks.homework2.husband.Husband;
import com.epam.tasks.homework2.model.Good;
import com.epam.tasks.homework2.shop.Shop;
import com.epam.tasks.homework2.shop.impl.ApplianceShop;
import com.epam.tasks.homework2.shop.impl.FoodShop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HusbandImpl implements Husband {

    private List<Shop> shops;

    public HusbandImpl() {
        List<Shop> shopList = new ArrayList<>();
        shopList.add(new ApplianceShop());
        shopList.add(new FoodShop());
        this.shops = shopList;
    }

    List<Good> getGoodsList() {
        List<Good> goodList = new ArrayList<>();
        for(Shop shop : shops){
            goodList.addAll(shop.getGoodList());
        }
        return goodList;
    }

    @Override
    public List<Good> getListAllGoodsFromAllShops() {
        return getGoodsList();
    }

    List<Good> getGoodsListByRequiredList(List<String> requiredList) {
        List<Good> goodList = new ArrayList<>();
        for(String good : requiredList){
            List<Good> goods = getGoodsList().stream()
                    .filter(x -> x.getName().equals(good))
                    .collect(Collectors.toList());
            goodList.addAll(goods);
        }
        return goodList;
    }

    @Override
    public List<Good> getRequiredGoodList(List<String> requiredList) {
        return getGoodsListByRequiredList(requiredList);
    }

    @Override
    public long getTotalePriceByRequiredList(List<String> requiredList) {
        return getGoodsListByRequiredList(requiredList).stream()
                .map(Good::getPrice)
                .mapToLong(x -> x)
                .sum();
    }
}
