package com.tedu.cn.ob;

public class Driver {
    public static void main(String[] args) {
        Person person1 = new Person("李阳", 22, "男", "65", "178");
        Person person2 = new Person("李阳", 22, "男", "65", "178");
        System.out.println(person1.equals(person2));
        System.out.println(person1==person2);
    }

}