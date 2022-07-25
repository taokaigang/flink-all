package day30.eDesigner;

import java.util.Random;

/**
 * @Description
 */
public class Productor extends Thread {
    // 厨师需要知道，生产完汉堡之后，要放到哪一个橱柜中
    private Box box;
    // 这个厨师生产一个汉堡需要多长时间
    private long productTimeMillions;

    public Productor(String name, long productTimeMillions, Box box) {
        super(name);
        this.productTimeMillions = productTimeMillions;
        this.box = box;
    }

    @Override
    public void run() {
        String[] names = {"香辣鸡腿堡", "菠萝鸡腿堡", "劲脆鸡腿堡", "双层牛肉汉堡", "鳕鱼堡"};
        Random random = new Random();

        while (true) {
            // 让线程休眠指定的时间，模拟生产的过程
            try {
                Thread.sleep(this.productTimeMillions);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 1. 实例化一个汉堡对象，作为本地生产的产物
            Hamburg hamburg = new Hamburg(random.nextInt(1000), names[random.nextInt(names.length)]);
            // 2. 将汉堡存入到橱柜中
            this.box.push(hamburg);
            // 3. 打印一个生产日志
            System.out.printf("生产者: %s 生产了一个汉堡，编号: %d, 名字是:%s \n", getName(), hamburg.getId(), hamburg.getName());
        }
    }
}
