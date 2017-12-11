package com.bodu.hibernate.inheritance_anno;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * project: bodu-hibernate
 * author: zhongyp
 * date: 2017/12/11
 * mail: zhongyp001@163.com
 */



@Entity
@DiscriminatorValue("regularemployee")
public class Regular_Employee extends Employee {

    @Column(name = "salary")
    private float salary;

    @Column(name = "bonus")
    private int bonus;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

}