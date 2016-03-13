package com.nc.edu.spring;

import java.util.*;

/**
 * Created by Ксения on 3/13/2016.
 */
public class Hedgehog {

    private Map<String, String> familyNames;

    public void setFamilyNames(Map<String, String> familyNames) {
        this.familyNames = familyNames;
        System.out.println("Hedgehog.setFamilyNames");
        System.out.println("familyNames = " + familyNames);
    }
}
