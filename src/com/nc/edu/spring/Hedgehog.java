package com.nc.edu.spring;

import java.util.*;

/**
 * Created by Ксения on 3/13/2016.
 */
public abstract class Hedgehog {
    private Nose nose = new Nose();
    protected abstract Nose createNose();
}
