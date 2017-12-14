package com.bodu.hibernate.component;

/**
 * project: bodu-hibernate
 * author: zhongyp
 * date: 2017/12/14
 * mail: zhongyp001@163.com
 */
public class Employee {
    private int employeeId;
    private String name, email;

    private Address address;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
