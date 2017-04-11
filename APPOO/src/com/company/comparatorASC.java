package com.company;

import java.util.Comparator;

/**
 * Created by Ion C on 11.04.2017.
 */
public class comparatorASC implements Comparator<Laptop> {


    @Override
    public int compare(Laptop obj1, Laptop obj2)
    {
        return obj1.getBrand().compareTo(obj2.getBrand());
    }
}
