package Java.Thread78_84;

/**
 * 多线程
 *
 * 进程(Process): 程序的一次运行,操作系统分配资源的最小单位,同一个进程共享同一份内存资源,不同进程之间不共享内存资源
 *      如果两个进程要进行数据交换,可以通过"文件",网络通信等方式
 *
 * 线程:(Thread): 一个进程至少有一个线程,还可以有多个线程
 *
 * 多线程实现方式:
 * ① 继承 Thread类
 *      重写run()方法  创建自定义Thread对象 执行start()方法 使线程处于就绪状态以备抢夺CPU资源
 * ② 实现Runnable接口
 *      重写run()方法  创建Thread对象 执行start()方法 使线程处于就绪状态以备抢夺CPU资源
 */
public class ThreadTest78 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        Thread thread1 = new Thread(myRunnable);
        thread1.start();

    }
}

/**
 * 继承Thread类
 */
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i+=2) {
            System.out.println(i);
        }
    }
}

/**
 * 实现Runnable接口
 */
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i < 10; i+=2) {
            System.out.println(i);
        }
    }
}