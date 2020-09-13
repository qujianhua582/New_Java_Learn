package Java.Thread78_84;

/**
 * Thread中的方法
 *
 * 构造器:
 *  new Thread()
 *  new Thread(Runnable r)
 *  new Thread(String name) 为线程命名
 *  new Thread(Runnable r,String name) 为线程命名
 *
 * 方法:
 *  ① run()
 *  ② start()
 *  ③ setName()/getName() 设置线程名/获取线程名
 *     线程名默认为 Thread-0 Thread-1 ....
 *  ④ Thread.currentName.getName() 获取当前线程的名称
 *  ⑤ setPriority(int a) 设置线程的优先级(1-10)
 *      优先级低的不一定没有机会执行,只是概率较低
 *      如果设置的优先级不在1-10之间,会抛出错误
 *      Thread.MIN_PRIORITY 1
 *      Thread.NORM_PRIORITY 5
 *      Thread.MAX_PRIORITY 10
 *
 *  ⑥ getPriority() 获取线程的优先级
 *
 *  ⑦ sleep(int a) 线程休眠 单位:毫秒
 *
 *  ⑧ join() 加塞,插队
 *
 *  ⑨ yield() 暂停
 *
 *  其中 currentThread()  sleep()  yield() 都是静态方法
 *
 *
 *  sleep() 和 wait()的区别
 *      sleep(): Thread()中的方法,静态方法,不是释放同步锁
 *      wait(): 非静态方法,会释放同步锁,并必须是有同步锁才能使用
 *
 *  start() 和 run()的区别
 *      start(): 将线程由新建转为就绪状态,以抢夺CPU资源
 *      run(): 非程序员调用,run()中是要实现的代码
 */
public class ThreadMethod79 {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
        Thread.sleep(5000); //休眠5秒
        myThread1.setPriority(10); //为线程设置优先级
        myThread1.setName("线程***"); //为线程重命名
        myThread1.join(); //插队加塞
        System.out.println(Thread.currentThread().getName());
    }
}

class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}