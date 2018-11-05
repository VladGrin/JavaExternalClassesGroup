package com.epam.tasks.homework2;

import com.epam.tasks.homework2.husband.Husband;
import com.epam.tasks.homework2.husband.impl.HusbandImpl;
import com.epam.tasks.homework2.wife.Wife;
import com.epam.tasks.homework2.wife.impl.WifeImpl;

public class Action {
    public static void main(String[] args) {

        Husband husband = new HusbandImpl();
        Wife wife = new WifeImpl(husband);

        wife.ShowAllGoodsFromAllShops();
        wife.ShowListGoodsFromRequiredList();
        wife.ShowTotalPrice();
    }
}
