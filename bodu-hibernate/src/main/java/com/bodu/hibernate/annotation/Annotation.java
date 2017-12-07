package com.bodu.hibernate.annotation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * project: bodu-hibernate
 * author: Administrator
 * date: 2017/11/30
 * mail: zhongyp001@163.com
 */

@Entity //标注实体
@Table(name = "demo") // 修改默认表名
public class Annotation {

    @Id // 主键策略
    private int id;
    private String firstName,lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
