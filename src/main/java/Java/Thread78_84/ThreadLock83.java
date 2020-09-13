package Java.Thread78_84;

import java.util.ArrayList;

/**
 * 线程安全问题和线程锁
 *
 * 多个线程使用同一份数据,就会出现线程安全问题
 *
 * 解决: 加锁
 *  ① 同步的锁对象可以是任意类型的对象
 *  ② 使用共享数据的这些线程,使用同一个锁对象
 *
 *  加锁方式:
 *      ① 同步代码块
 *      synchronized(同步的锁对象){
 *          需要锁起来的代码,不想别的线程插入进来
 *      }
 *      ② 同步方法
 *      [权限修饰符] synchronized 返回值 方法名 (形参列表) {Smsingle}
 */
public class ThreadLock83 {
    public static void main(String[] args) {
        TestTicket testTicket1 = new TestTicket();
        TestTicket testTicket2 = new TestTicket();

        testTicket1.start();
        testTicket2.start();
    }
}


class TestTicket extends Thread{
    private static Ticket ticket = new Ticket();

    @Override
    public void run() {
        //同步代码块
        while (true){
            synchronized (""){
                if (ticket.hasTicket())
                    System.out.println(ticket.removeTicket());
                else
                    break;
            }
        }
    }
}

class Ticket{
    private ArrayList<String> arrayList = new ArrayList<>();

    public Ticket() {
        arrayList.add("01A");
        arrayList.add("01B");
        arrayList.add("01C");
        arrayList.add("02A");
        arrayList.add("02B");
        arrayList.add("02C");
    }

    /**
     * 是否有票
     * @return
     */
    public boolean hasTicket(){
        return arrayList.size() > 0;
    }

    /**
     * 卖票
     * @return
     */
    public String removeTicket(){
        String remove = arrayList.remove(0);
        return remove;
    }
}