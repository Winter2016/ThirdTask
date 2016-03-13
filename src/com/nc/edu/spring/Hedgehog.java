package com.nc.edu.spring;

import java.util.*;

/**
 * Created by Ксения on 3/13/2016.
 */
public class Hedgehog {
    private String name;
    private int age;

    public void setName(String name) {
        System.out.println("Hedgehog.setName");
        this.name = name;
        System.out.println("name = " + name);
    }

    public void setAge(int age) {
        System.out.println("Hedgehog.setAge");
        this.age = age;
        System.out.println("age = " + age);
    }
}
