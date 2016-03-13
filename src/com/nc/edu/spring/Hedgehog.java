package com.nc.edu.spring;

import java.util.*;

/**
 * Created by Ксения on 3/13/2016.
 */
public class Hedgehog {

    private List<Needle> needles;
    private Set<String> childrenNames;
    private Map<String, String> familyNames;

    public void setNeedles(List<Needle> needles) {
        this.needles = needles;
        System.out.println("Hedgehog.setNeedles");
        System.out.println("needles = " + needles);
    }

    public void setChildrenNames(Set<String> childrenNames) {
        this.childrenNames = childrenNames;
        System.out.println("Hedgehog.setChildrenNames");
        System.out.println("childrenNames = " + childrenNames);
    }

    public void setFamilyNames(Map<String, String> familyNames) {
        this.familyNames = familyNames;
        System.out.println("Hedgehog.setFamilyNames");
        System.out.println("familyNames = " + familyNames);
    }
}
