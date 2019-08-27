package com.thoughtworks.collection;


import java.util.ArrayList;
import java.util.List;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
    	List<Integer> list = new ArrayList<>();
    	for(int i = array.get(0);i<=array.size();i++) {
    		if(i%2==0) {
    			list.add(i);
    		}
    	}
    	return list;
    }

    public List<Integer> filterMultipleOfThree() {
    	List<Integer> list = new ArrayList<>();
    	for(int i = 0;i<=array.size()-1;i++) {
    		if(array.get(i)%3==0) {
    			list.add(array.get(i));
    		}
    	}
    	return list;
    }
}
