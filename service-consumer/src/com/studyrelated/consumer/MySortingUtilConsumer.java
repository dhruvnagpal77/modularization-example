package com.studyrelated.consumer;

import com.studyrelated.sorting.util.MySortingUtil;
// import com.studyrelated.sorting.algo.BubbleSort; Won't compile & will give error, Package
// 'com.studyrelated.sorting.algo' is declared in module 'service.provider', which does not export it
// to module 'service.consumer'

import java.util.ArrayList;
import java.util.List;

public class MySortingUtilConsumer {

    public static void main(String[] args) {
        MySortingUtil mySortingUtil = new MySortingUtil();
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Eve");
        list.add("Adam");

        System.out.println(mySortingUtil.sort(list));
        //BubbleSort.sort(list);  Same error as above
    }
}
/**
 * Using modules we can ensure that the consumer only has access to the public classes & methods of the package com.studyrelated.sorting.util.MySortingUtil
 * & is unable to access com.studyrelated.sorting.algo package.
 * This gives us control of what exactly we want should be accessible to code outside our module giving us better encapsulation.
 */
