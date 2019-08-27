package com.thoughtworks.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyMap {

    List<Integer> array;

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> sortFromBig() {
        Collections.reverse(this.array);
        return array;
    }

    public List<Integer> sortFromSmall() {
    	 Collections.sort(this.array);
         return array;
    }
}
