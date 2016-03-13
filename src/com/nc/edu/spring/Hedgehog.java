package com.nc.edu.spring;

import java.util.*;

/**
 * Created by Ксения on 3/13/2016.
 */
public class Hedgehog {

    private List<Needle> needles;
    private Set<String> childrenNames;
    private Map<String, String> familyNames;

    public Hedgehog(List<Needle> needles,Set<String> childrenNames, Map<String,String> familyNames) {
        this.needles = needles;
        this.childrenNames = childrenNames;
        System.out.println("Hedgehog.Hedgehog");
        System.out.println("needles = " + needles);
        System.out.println("childrenNames = " + childrenNames);
        System.out.println("familyNames = " + familyNames);
    }
}
