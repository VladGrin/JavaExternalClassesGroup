package com.epam.tasks.homework2.husband;

import com.epam.tasks.homework2.model.Good;

import java.util.List;

public interface Husband {

    List<Good> getListAllGoodsFromAllShops();

    List<Good> getRequiredGoodList(List<String> requiredList);

    long getTotalePriceByRequiredList(List<String> requiredList);
}
