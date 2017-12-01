package com.bodu.hibernate.cache;

/**
 * project: bodu-hibernate
 * author: Administrator
 * date: 2017/11/30
 * mail: zhongyp001@163.com
 */
public class CacheSample {
    private String name;
    private int age;
    private int id;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CacheSample(){
        super();

    }
    public CacheSample(String name,int age){
        super();
        this.name = name;
        this.age = age;
    }

}
