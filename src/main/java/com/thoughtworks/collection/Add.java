package com.thoughtworks.collection;


import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
    	if(leftBorder>rightBorder) {
    		int temp = leftBorder;
    		leftBorder =rightBorder;
    		rightBorder =temp;
    	}
    	List<Integer> list = new ArrayList<>();
    	for(int i = leftBorder;i<=rightBorder;i++) {
    		if(i%2==0) {
    			list.add(i);
    		}
    	}
    	IntSummaryStatistics collect = list.stream().collect(Collectors.summarizingInt(value -> value));
    	return  (int) (collect.getSum());
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
    	IntSummaryStatistics collect = arrayList.stream().collect(Collectors.summarizingInt(value -> 3*value+2));
    	return  (int) (collect.getSum());
    }

    public double getAverageOfEven(List<Integer> arrayList) {
    	List<Integer> list = new ArrayList<>();
    	for(int i = arrayList.get(0);i<=arrayList.size();i++) {
    		if(i%2==0) {
    			list.add(i);
    		}
    	}
    	IntSummaryStatistics collect = list.stream().collect(Collectors.summarizingInt(value -> value));
    	return  (int) (collect.getAverage());
    }
    
}
