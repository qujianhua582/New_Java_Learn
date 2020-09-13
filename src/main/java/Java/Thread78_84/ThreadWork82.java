package Java.Thread78_84;

/**
 * 龟兔赛跑 合并代码
 */
public class ThreadWork82 {
    public static void main(String[] args) {
        Running tuzi = new Running("兔子",100,10000);
        Running wugui = new Running("乌龟",1000,1000);

        tuzi.start();
        wugui.start();

    }
}


class Running extends Thread{
    private int one_time; //跑一米所用时间
    private int sleep_time; //跑十米休息时间
    private boolean flag; //默认为false 用于判断到达终点

    //构造器
    public Running(String name, int one_time, int sleep_time) {
        super(name);
        this.one_time = one_time;
        this.sleep_time = sleep_time;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 30; i++) {
            System.out.println(Thread.currentThread().getName() + "跑" + i);
            
            //跑一米时间
            try {
                Thread.sleep(one_time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            //跑十米休息时间
            if (i == 10 || i == 20){
                try {
                    System.out.println(Thread.currentThread().getName() + "休息");;
                    Thread.sleep(sleep_time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}