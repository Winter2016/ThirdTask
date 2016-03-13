package com.nc.edu.spring;

/**
 * Created by Ксения on 3/13/2016.
 */
public class Hedgehog {
    private Nose nose;
    private int age;
   /* public Hedgehog(Nose nose, int age)
    {
        this.nose = nose;
        this.age = age;
        System.out.println("Hedgehog.Hedgehog");
        System.out.println("nose = " + nose);
        System.out.println("age = " + age);
        System.out.println("this = " + this);
    }*/

    public Nose getNose() {
        return nose;
    }

    public void setNose(Nose nose) {
        this.nose = nose;
        System.out.println("Hedgehog.Hedgehog");
        System.out.println("nose = " + nose);
        System.out.println("age = " + age);
        System.out.println("this = " + this);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Hedgehog.Hedgehog");
        System.out.println("nose = " + nose);
        System.out.println("age = " + age);
        System.out.println("this = " + this);
    }
}
