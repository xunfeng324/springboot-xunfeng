package xunfemg.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Java_ListAndMap {

    /**
     * Collection 接口
     * List 接口
     * ArrayList
     * LinkedList
     * Set 接口
     * HashSet
     * TreeSet
     * Map 接口
     * HashMap
     * TreeMap
     * Iterator 接口
     * Collections 工具类
     */
    public static void main(String[] args) {
        list1();
    }

    private static void list1() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2,50);
        list.add(4);
        list.add(1);

        //遍历
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+",");
        }
        System.out.println();
        //工具类排序
        Collections.sort(list);
        for (Integer i : list) {
            System.out.print(i+",");
        }
        System.out.println();
        System.out.println(list);
    }
}
