package com.zjl.study.week1;


import javax.xml.stream.XMLInputFactory;
import java.util.Arrays;
import java.util.Random;


/**
 * @ClassName ArrayTest
 * @Description TODO
 * @Author zjl
 * @Date 2020/10/6
 **/
public class ArrayTest {
    static int MAX = 5;

    public static void main(String[] args) {

        int sum = 0;
        int[] a = new int[MAX];
        //创建随机数种子
        Random random = new Random();
        //数组原始值为
        for (int i = 0; i < MAX; i++) {
            //循环生成100以内随机整数赋值给数组
            a[i] = random.nextInt(100);
            System.out.print(a[i] + "");
        }
        System.out.println();
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < MAX; i++) {
            max = a[i];

            if (a[i] < min) {
                min = a[i];
            }
        }


        System.out.println("最大值是：" + max);
        System.out.println("最小值是：" + min);
        sum = max + min;
        System.out.println("和为：" + sum);


        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; i++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }


        }
        // System.out.print(a[i]+"");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "");
        }
    }
}