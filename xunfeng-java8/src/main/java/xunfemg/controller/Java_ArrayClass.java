package xunfemg.controller;

import java.util.Arrays;

public class Java_ArrayClass {
    /**
     * 数组对于每一门编程语言来说都是重要的数据结构之一，当然不同语言对数组的实现及处理也不尽相同。
     * Java 语言中提供的数组是用来存储固定大小的同类型元素。
     * 你可以声明一个数组变量，
     * 如 numbers[100] 来代替直接声明 100 个独立变量 number0，number1，....，number99。
     * 本教程将为大家介绍 Java 数组的声明、创建和初始化，并给出其对应的代码。
     *
     * @param args
     */
    public static void main(String[] args) {
//        arrayNumber();
        arraysClass();
    }

    private static void arraysClass() {
        /**
         * Arrays 类
         *
         * java.util.Arrays 类能方便地操作数组，它提供的所有方法都是静态的。
         * 具有以下功能：
         * 给数组赋值：通过 fill 方法。
         * 对数组排序：通过 sort 方法,按升序。
         * 比较数组：通过 equals 方法比较数组中元素值是否相等。
         * 查找数组元素：通过 binarySearch 方法能对排序好的数组进行二分查找法操作。
         */

        Integer[] a = {1, 3, 5, 4, 2, 6, 9, 7, 8};
        Integer[] b = {1, 3, 5, 4, 2, 6, 9, 7, 8};
        Integer[] b1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //比较
        boolean equals = b.equals(a);
        System.out.println(equals);
        //赋值
        Arrays.fill(a,1,4,99);
        System.out.println("fill:"+Arrays.toString(a));
        //排序
        Arrays.sort(a);
        String string = Arrays.toString(a);
        System.out.println(string);
        //binarySearch  则返回搜索键的索引；否则返回 (-(插入点) - 1)。
        int binarySearch = Arrays.binarySearch(a, 6);
        System.out.println(binarySearch);

    }

    private static void arrayNumber() {
        /**
         * 声明数组
         */
        Integer[] arrayRefVar;   // 首选的方法
        String arrayRefVar1[];  // 效果相同，但不是首选方法

        /**
         * 创建数组
         */
        arrayRefVar = new Integer[10];
        arrayRefVar1 = new String[10];
        /**
         * 方法2
         */
        Integer[] arrayRefVar3 = new Integer[10];

        /**
         * 方法3
         */
        Integer[] arrayRefVar4 = {1, 2, 3, 4};
        for (int i = 0; i < 10; i++) {
            arrayRefVar[i] = i;
        }
        /**
         * 处理数组
         * 数组的元素类型和数组的大小都是确定的，所以当处理数组元素时候，
         * 我们通常使用基本循环或者 For-Each 循环。
         */

        for (Integer i : arrayRefVar) {
            System.out.println(arrayRefVar[i]);
        }
        /**
         * 数组作为函数的参数
         */
        f1(arrayRefVar);

        /**
         * 数组作为函数返回值
         */

        Integer[] f2 = f2();
        System.out.println(Arrays.toString(f2));

    }

    private static Integer[] f2() {
        Integer[] a = {11, 21, 31, 41};
        return a;
    }

    private static void f1(Integer[] arrayRefVar) {
        for (Integer j : arrayRefVar) {
            System.out.println("传递参数：" + arrayRefVar[j]);
        }
    }
}
