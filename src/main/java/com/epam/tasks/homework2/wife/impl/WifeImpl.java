package com.epam.tasks.homework2.wife.impl;

import com.epam.tasks.homework2.husband.Husband;
import com.epam.tasks.homework2.model.Good;
import com.epam.tasks.homework2.wife.Wife;

import java.util.ArrayList;
import java.util.List;

public class WifeImpl implements Wife {

    private Husband husband;
    private List<String> requiredList = createRequiredList();

    public WifeImpl(Husband husband) {
        this.husband = husband;
    }

    private List<String> createRequiredList(){
        List<String> requiredList = new ArrayList<>();
        requiredList.add("Sony");
        requiredList.add("Bread");
        return requiredList;
    }

    @Override
    public void ShowAllGoodsFromAllShops() {
        System.out.println("Total list:");
        List<Good> receiveList = husband.getListAllGoodsFromAllShops();
        receiveList.forEach(x-> System.out.println(x));
        System.out.println();
    }

    @Override
    public void ShowListGoodsFromRequiredList() {
        System.out.println("Bought:");
        List<Good> receiveList = husband.getRequiredGoodList(requiredList);
        receiveList.forEach(x-> System.out.println(x));
    }

    @Override
    public void ShowTotalPrice() {
        System.out.println("Total price = " + husband.getTotalePriceByRequiredList(requiredList));
    }
}
