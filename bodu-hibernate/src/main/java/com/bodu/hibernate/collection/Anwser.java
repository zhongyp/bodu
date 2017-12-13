package com.bodu.hibernate.collection;

/**
 * project: bodu-hibernate
 * author: zhongyp
 * date: 2017/12/13
 * mail: zhongyp001@163.com
 */
public class Anwser {
    private int id;
    private String answer;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswer() {

        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString(){
        return this.answer + ":" + this.id;
    }

}
