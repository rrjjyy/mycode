package r20211114;

import java.util.LinkedList;

 class Storage {

    // 仓库容量
    private final int MAX_SIZE = 10;
    //使用linklist集合存储数据
    private LinkedList<Object> list = new LinkedList<>();
    //定义一个生产者的方法
    public void produce() {
        //线程同步锁
        synchronized (list) {
            //当list集合满时
            while (list.size() + 1 > MAX_SIZE) {
                System.out.println("【生产者" + Thread.currentThread().getName()
                        + "】仓库已满");
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //如果没有满，就添加新的产品
            list.add(new Object());
            System.out.println("【生产者" + Thread.currentThread().getName()
                    + "】生产一个产品，现库存" + list.size());
            list.notifyAll();
        }
    }

    public void consume() {
        synchronized (list) {
            while (list.size() == 0) {
                System.out.println("【消费者" + Thread.currentThread().getName()
                        + "】仓库为空");
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            list.remove();
            System.out.println("【消费者" + Thread.currentThread().getName()
                    + "】消费一个产品，现库存" + list.size());
            list.notifyAll();
        }
    }
}
//实现Runnabale接口，实现多线程
 class Producer implements Runnable{
    private Storage storage;

    public Producer(){}

    public Producer(Storage storage){
        this.storage = storage;
    }

    @Override
    //重新run方法
    public void run(){
        while(true){
            try{
                //每隔1000毫秒生产一个产品
                Thread.sleep(1000);
                storage.produce();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}


 class Consumer implements Runnable{
    private Storage storage;

    public Consumer(){}

    public Consumer(Storage storage){
        this.storage = storage;
    }

    @Override
    public void run(){
        while(true){
            try{
                //每隔3000毫秒消费一个产品
                Thread.sleep(3000);
                storage.consume();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}


public class Main {

    public static void main(String[] args) {
        //new一个存储对象
        Storage storage = new Storage();
        //new了三个生产者对象
        Thread p1 = new Thread(new Producer(storage));
        Thread p2 = new Thread(new Producer(storage));
        Thread p3 = new Thread(new Producer(storage));
        //new了三个消费者对象
        Thread c1 = new Thread(new Consumer(storage));
        Thread c2 = new Thread(new Consumer(storage));
        Thread c3 = new Thread(new Consumer(storage));
        //启动线程，即三个生产者和三个消费者
        p1.start();
        p2.start();
        p3.start();
        c1.start();
        c2.start();
        c3.start();
    }
}





