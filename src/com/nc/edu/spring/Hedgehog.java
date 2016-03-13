package com.nc.edu.spring;

import java.util.*;

/**
 * Created by Ксения on 3/13/2016.
 */
public class Hedgehog {
    private Nose nose = new Nose();

    public Hedgehog() {
        System.out.println("Hedgehog.setNose");
        System.out.println("nose = " + nose);
        System.out.println("this = " + this);
    }

    public Nose createNose() {
        System.out.println("Hedgehog.createNose");
        System.out.println("nose = " + nose);
        return nose;}
}
