package com.nc.edu.spring;

/**
 * Created by Ксения on 3/13/2016.
 */
public class Hedgehog {
    private Nose nose;
    private int age;
    public Hedgehog(Nose nose, int age)
    {
        this.nose = nose;
        this.age = age;
        System.out.println("Hedgehog.Hedgehog");
        System.out.println("nose = " + nose);
        System.out.println("age = " + age);
        System.out.println("this = " + this);
    }
}
