package com.thoughtworks.collection;

import org.junit.Test;

import java.util.*;

import static org.fest.assertions.api.Assertions.assertThat;

public class FilterTest {

    @Test
    public void should_return_even() {
        //求数组中的偶数
        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> arrayList = Arrays.asList(array);

        Filter filter = new Filter(arrayList);

        Integer[] result = new Integer[]{2, 4};
        List<Integer> resultList = Arrays.asList(result);

        assertThat(filter.filterEven()).isEqualTo(resultList);
    }

    @Test
    public void should_return_multiple_of_three() {
        //求数组中3的倍数
        Integer[] array = new Integer[]{6, 2, 3, 4, 9};
        List<Integer> arrayList = Arrays.asList(array);
        Filter filter = new Filter(arrayList);

        Integer[] result = new Integer[]{6, 3, 9};
        List<Integer> resultList = Arrays.asList(result);

        assertThat(filter.filterMultipleOfThree()).isEqualTo(resultList);
    }
}
