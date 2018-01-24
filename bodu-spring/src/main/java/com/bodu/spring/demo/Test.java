package com.bodu.spring.demo;

import java.io.*;

/**
 * project: bodu-spring
 * author: zhongyp
 * date: 2018/1/15
 * mail: zhongyp001@163.com
 */
public class Test {
    public void getTestName(){
        System.out.println("Test Name");
        File file = new File("");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            LineNumberInputStream lineNumberInputStream = new LineNumberInputStream(bufferedInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public Node createNodeList(int[] num, int index){
        Node node = null;
        if(index<num.length){
            node = new Node();
            node.value = num[index];
            if(index+1<num.length){
                node.next = createNodeList(num, index+1);
            }
        }

        return node;
    }

    public Node reserveNodeList(Node node,Node newNode){

        if(node==null){
            return  null;
        }

        if(node.next!=null){

            return (reserveNodeList(node.next, node).next = node);
        }
        return node;
    }

    public static void main(String[] args){
        Test test = new Test();
        int[] num = {3,2,1,6,5,4,9,8,7};
        Node node = test.createNodeList(num, 0);
        Node node1 = test.reserveNodeList(node, null);

    }

}
class Node{
    int value;
    Node next;
}