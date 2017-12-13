package com.bodu.hibernate.collection;

import java.util.List;

/**
 * project: bodu-hibernate
 * author: zhongyp
 * date: 2017/12/13
 * mail: zhongyp001@163.com
 */
public class Question {
    private int id;
    private String qname;
    private List<Anwser> anwsers;

        public List<Anwser> getAnwsers() {
        return anwsers;
    }

    public void setAnwsers(List<Anwser> anwsers) {
        this.anwsers = anwsers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQname() {
        return qname;
    }

    public void setQname(String qname) {
        this.qname = qname;
    }

    public List<Anwser> getAnswers() {
        return anwsers;
    }

    public void setAnswers(List<Anwser> anwsers) {
        this.anwsers = anwsers;
    }
}
