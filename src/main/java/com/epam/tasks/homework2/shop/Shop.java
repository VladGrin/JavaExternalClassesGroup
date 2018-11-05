package com.epam.tasks.homework2.shop;

import com.epam.tasks.homework2.model.Good;

import java.util.List;

public interface Shop {

    List<? extends Good> getGoodList();

}
