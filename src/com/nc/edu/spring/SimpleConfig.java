package com.nc.edu.spring;

/**
 * Created by Ксения on 3/13/2016.
 */
public class SimpleConfig {
    private String name = "Ksusha";
    private int age = 21;

    public String getName() {
        System.out.println("SimpleConfig.getName");
        System.out.println("name = " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("SimpleConfig.setName");
    }

    public int getAge() {
        System.out.println("SimpleConfig.getAge");
        System.out.println("age = " + age);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("SimpleConfig.setAge");
    }
}
