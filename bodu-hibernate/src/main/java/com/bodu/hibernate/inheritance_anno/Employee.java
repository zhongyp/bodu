package com.bodu.hibernate.inheritance_anno;

import javax.persistence.*;

/**
 * project: bodu-hibernate
 * author: zhongyp
 * date: 2017/12/11
 * mail: zhongyp001@163.com
 */
@Entity
@Table(name = "employee101")
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//employee101表主键ID必须是自动生成策略 auto_increment
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // setters and getters
}
/**
 * 下面的是，当每个类对应一张表时，类的注解配置
 *
 */
//@Entity
//@Table(name = "employee103")
//@Inheritance(strategy = InheritanceType.JOINED)
//public class Employee {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id")
//    private int id;
//
//    @Column(name = "name")
//    private String name;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}