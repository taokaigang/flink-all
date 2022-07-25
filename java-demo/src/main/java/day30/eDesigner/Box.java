package day30.eDesigner;

import java.util.LinkedList;

/**
 *      橱柜: 可以把它当做临界资源
 *      生产者(厨师), 生产完产品后, 会放到橱柜中
 *      消费者(顾客), 消费产品时, 从橱柜中获取
 *
 *      功能设计:
 *      1. 存一个汉堡
 *      2. 取一个汉堡
 */
public class Box {
    // 存放所有的汉堡的集合
    private LinkedList<Hamburg> list;
    // 橱柜的容量，可以容纳多少个汉堡
    private int capacity;
    // 实例化橱柜的时候，指定这个橱柜的容量
    public Box(int capacity) {
        this.capacity = capacity;
        this.list = new LinkedList<>();
    }
    // 使用默认的构造方法，将默认的容量设置为30
    public Box() {
        this(30);
    }

    /**
     * 将一个汉堡存入到橱柜中
     * @param hamburg 需要存进去的汉堡
     */
    public synchronized void push(Hamburg hamburg) {
        // 1. 判断橱柜是否已经存满了
        if (this.list.size() >= this.capacity) {
            // 说明橱柜已经存满了，已经不需要再生产了
            // 生产者需要等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 2. 如果在添加的时候，橱柜并没有存满；或者生产者被唤醒了。
        this.list.add(hamburg);
        // 3. 通知消费者消费
        this.notifyAll();
    }

    /**
     * 从橱柜中获取一个汉堡
     * @return 获取一个汉堡
     */
    public synchronized Hamburg pop() {
        // 1. 判断是否可以消费
        if (this.list.size() == 0) {
            // 说明已经没有产品可以消费了
            // 自己等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 2. 从橱柜中获取一个汉堡
        Hamburg hamburg = this.list.removeFirst();
        // 3. 如果取完之后库存告急，马上通知生产者生产
        if (this.list.size() < 5) {
            this.notifyAll();
        }
        // 4. 返回本次获取到的汉堡
        return hamburg;
    }

}
