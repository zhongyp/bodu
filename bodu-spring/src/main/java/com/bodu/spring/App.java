package com.bodu.spring;

import com.bodu.spring.demo.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
//        Test chn = (Test) ctx.getBean("test");
//        chn.getTestName();

        int[] a = {1,2,4,7,3,5,6,8};
        int[] b = {4,7,2,1,5,3,8,6};
        int[] c = {7,4,2,5,8,6,3,1};
//        App app = new App();
//        Tree tree = app.buildTreeByPreMid(a, 0 , a.length-1, b, 0 , b.length-1);
//        app.printPre(tree);
//        System.out.println("");
//        app.printMid(tree);
//        System.out.println("");
//        app.printLast(tree);

        App app = new App();
        Tree tree = app.buildTreeByMidLast(c, 0 , a.length-1, b, 0 , b.length-1);
//        app.printPre(tree);
//        System.out.println("");
//        app.printMid(tree);
//        System.out.println("");
//        app.printLast(tree);
//        System.out.println("");
//        app.printLevel(tree);
//         app.hightTree(tree);
//         System.out.print(app.hightTree(tree));
         app.FindPath(tree,10,0);
    }

    /**
     * 先序、中序遍历二叉树
     * 先序：根左右
     * 中序：左根右
     * 算法思想：
     * 按照顺序在先序a中取值a[s1]，获取a[s1]在中序b的索引index，根据索引index获取左子树的先序和中序，然后递归
     *
     */
    int count = 0;
    public  Tree buildTreeByPreMid(int[] a, int s1, int e1,int[] b, int s2, int e2){

        if(s1>e1||s2>e2){
            return null;
        }
        Tree tree = new Tree();
         tree.value = a[count];
        int index = getIndex(b, a[count]);
        count++;
        tree.left = buildTreeByPreMid(a, count, s1+index, b, s2, index-1);
        tree.right = buildTreeByPreMid(a, count, s1+e2-index, b, index+1, e2);

        return tree;
    }

    /**
     *
     * 中序、后序 构建二叉树
     *
     */
    int count1 = 7;
    public Tree buildTreeByMidLast(int[] a, int s1, int e1,int[] b, int s2, int e2){
        if(s1>e1||s2>e2){
            return null;
        }
        Tree tree = new Tree();
        tree.value = a[e1];
        int index = getIndex(b, a[e1]);
        count1--;
        tree.right = buildTreeByMidLast(a, count1+index-e2+1, count1, b, index+1, e2);
        tree.left = buildTreeByMidLast(a, s1, count1, b, s2, index-1);
        return tree;
    }


    private int getIndex(int[] b,int value){
        int count = 0;
        for(int tmp:b){
            if(tmp==value){
                return count;
            }
            count++;
        }
        return 0;
    }

    public void printPre(Tree tree){
        if(tree != null){
            System.out.print(tree.value);
        }
        if(tree.left != null){
            printPre(tree.left);
        }
        if(tree.right != null){
            printPre(tree.right);
        }

    }
    public void printMid(Tree tree){
        if(tree.left != null){
            printMid(tree.left);
        }
        if (tree != null){
            System.out.print(tree.value);
        }
        if(tree.right != null){
            printMid(tree.right);
        }

    }
    public void printLast(Tree tree){
        if(tree.left != null){
            printLast(tree.left);
        }
        if(tree.right != null){
            printLast(tree.right);
        }
        if (tree != null){
            System.out.print(tree.value);
        }

    }

    /**
     *
     * 1.将节点放入队列
     * 2.取出队列第一个节点
     * 3.将取出的节点的左右节点一次放入队列
     * 递归
     */
    public void printLevel(Tree tree){
        if(tree == null){
            return;
        }
        Tree current;
        LinkedList list = new LinkedList();
        list.offer(tree);
        while(!list.isEmpty()){
            current = (Tree)list.poll();
            System.out.println(current.value);
            if(current.left != null){
                list.offer(current.left);
            }
            if(current.right != null){
                list.offer(current.right);
            }

        }
    }
    // 二叉树叶子节点个数
    int count2 = 0;
    public void sumLeaf(Tree tree){
        if(tree.left == null&&tree.right == null){
            count2++;
        }
        if(tree.left != null){
            sumLeaf(tree.left);
        }
        if(tree.right != null){
            sumLeaf(tree.right);
        }
    }

    // 二叉树的高度
    public int hightTree(Tree tree){
        if(tree == null){
            return 0;
        }
        if(tree.left == null && tree.right == null){
            return 1;
        }
        int l_hight = hightTree(tree.left);
        int r_hight = hightTree(tree.right);
        return l_hight>r_hight?l_hight+1:r_hight+1;
    }
    public Tree lowestCommonAncestor(Tree root, Tree p, Tree q) {
        // 左右子树探索时发现目标节点，则通过返回值标记
        if(root == null || p == root || q == root) {
            return root;
        }

        // 查看左子树中是否有目标结点，没有为null
        Tree l = lowestCommonAncestor(root.left,p,q);
        // 查看右子树中是否有目标结点，没有为null
        Tree r = lowestCommonAncestor(root.right,p,q);

        //都不为空，说明做右子树都有目标结点，则公共祖先就是本身
        if(l!= null && r!= null) {
            return root;
        }
        // 其他情况，则要继续向上标记，显示此节点下边有目标节点
        return l != null?l:r;
    }

    // 路径值
    Stack<Integer> stack = new Stack();
    public void FindPath(Tree tree, int sum, int current){
        if(tree==null){
            return ;
        }

        current+=tree.value;
        stack.push(tree.value);
        if(current==sum){
            System.out.println("PATH:");
            for(int val : stack){
                System.out.print(val);
            }
        }
        if(current<sum){
            if(tree.left != null){
                FindPath(tree.left,sum,current);
            }
            if(tree.right != null){
                FindPath(tree.right,sum,current);
            }
        }

        current -= tree.value;
        stack.pop();
    }

}
class Tree{
    Tree left;
    Tree right;
    int value;
}