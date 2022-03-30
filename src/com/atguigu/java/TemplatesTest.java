package com.atguigu.java;


import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 * @author Denmark
 * @date 2022/3/29- 22:32
 *
 * 1.idea
 */
public class TemplatesTest {
    //模板六：psrf
    private static final Customer CUST = new Customer();

    // 变形：psf
    public static final int NUM = 1;

    // 变形：psfi
    public static final int  NUM2 = 2;

    // 变形：psfs
    public static final String NATION = "china";
    // 模板一：psvm
    public static void main(String[] args) {

        // 模板二：sout
        System.out.println("hello");
        // 变形：soutp / soutm /outv /xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        int num1 = 10;
        System.out.println("num1 = " + num1);
        System.out.println(num1);

        // 模板三：fori
        String[] arr = new String[]{"Tom","jerry","meiemi","lilei"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
            
        }
        // 变形：iter
        for (String s : arr) {
            System.out.println(s);

        }
        // 变形:itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);

        }

        // 模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(456);
        for (Object o : list) {

        }
        // 变形：list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        // 变形：list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
    }

    public void method(){
        System.out.println("TemplatesTest.method");
        
        // 模板五：ifN
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(456);
        if (list == null) {

        }
        //变形：
        if (list != null) {

        }
        // 变形：xxx.nn /xxx.null
        if (list == null) {

        }
    }
}
