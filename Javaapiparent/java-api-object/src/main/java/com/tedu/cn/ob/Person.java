package com.tedu.cn.ob;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String weight;
    private String height;

    public Person(String name, int age, String gender, String weight, String height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
    if (obj instanceof Person) {
        Person p = (Person) obj;
        return this.age==p.age ? true:false;
    }
    return false;
}

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return this.name+":"+this.age+":"+this.gender+":"+this.height+":"+this.weight+":";
    }
}
