package com.nc.edu.spring;

import java.util.*;

/**
 * Created by Ксения on 3/13/2016.
 */
public class Hedgehog {
    private Nose nose;

    public void setNose(Nose nose) {
        this.nose = nose;
        System.out.println("Hedgehog.setNose");
        System.out.println("nose = " + nose);
        System.out.println("this = " + this);
    }
}
