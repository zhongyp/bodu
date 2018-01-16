package com.bodu.redis;

import java.util.*;
import java.util.concurrent.*;
/**
 *
 * 实现List接口的可调整大小。实现所有可选的list操作，并允许所有元素，包括 null。
 * 除了实现List接口之外，这个类还提供了一些方法来处理内部用于存储列表的数组的大小。
 * （这个类大致相当于 Vector，除了它是不同步的。）
 * size，isEmpty， get，set， iterator和listIterator操作在常量时间内运行。
 * add操作运行在摊分常量时间中，即添加n个元素需要O（n）个时间。
 * 所有其他操作在线性时间内运行（粗略地说）。与LinkedList实现相比，常量因子是低的。
 * 每个<Array>实例都有一个容量。容量是用于存储列表中元素的数组的大小。
 * 它总是至少与列表大小一样大。当元素被添加到一个ArrayList 时，它的容量会自动增长。
 * 增长政策的细节并没有超出添加元素具有不变摊销时间成本的事实。
 * 在使用ensureCapacity 操作添加大量元素之前，应用程序可以增加一个ArrayList实例的容量。
 * 这可能会减少增量重新分配的数量。注意这个实现不同步。
 * 如果多个线程同时访问一个ArrayList实例，并且至少有一个线程在结构上修改了列表，它必须在外部同步。
 * （一个结构修改是任何添加或删除一个或多个元素的操作，或者显式调整后备数组的大小;仅仅设置一个元素的值不是一个结构修改）。
 * 这通常是通过自然地封装列表。  如果不存在这样的对象，则列表应该使用 {@link Collections＃synchronizedList Collections.synchronizedList} 方法“包装”。
 * 这最好在创建时完成，以防止意外非同步访问列表：List list = Collections.synchronizedList（new ArrayList（...））;
 * 这个类的{@link #iterator（）迭代器}和 {@link #listIterator（int）listIterator}方法返回的迭代器是fail-fast：
 * 如果在迭代器被创建之后，在任何时候结构修改列表，除了通过迭代器自己的 {@link ListIterator＃remove（）remove}或 {@link ListIterator＃add（Object）add}方法以外，迭代器将抛出 {@link ConcurrentModificationException}。
 * 因此，在并发修改的情况下，迭代器在未来不确定的时间会快速而干净地失败，而不是冒着任意的，非确定性的行为冒险。
 * 请注意，迭代器的快速失败行为无法得到保证，因为一般来说，不可能在存在非同步并发修改的情况下做出任何硬性保证。
 * 失败快速迭代器尽最大努力抛出ConcurrentModificationException异常。
 * 因此，编写一个依赖于这个异常的程序是正确的：<i>迭代器的失败 - 快速行为应该只用于检测错误 class是Java集合框架的成员。
 *
 */

/**
 *
 * 此处使用Arrays工具类的copyOf复制数组
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        /**
         *
         *
         */
        HashSet set = new HashSet();
        HashSet set1 = new HashSet(16);
        LinkedHashSet set3 = new LinkedHashSet();
        TreeSet set4 = new TreeSet();

        LinkedList list2 = new LinkedList();
        ArrayList list1 = new ArrayList();
        Vector v = new Vector();
        list2.
    }


}
