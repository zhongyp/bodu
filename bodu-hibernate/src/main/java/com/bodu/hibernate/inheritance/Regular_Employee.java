package com.bodu.hibernate.inheritance;

/**
 * project: bodu-hibernate
 * author: zhongyp
 * date: 2017/12/11
 * mail: zhongyp001@163.com
 */
public class Regular_Employee extends Employee {
    private float salary;
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
