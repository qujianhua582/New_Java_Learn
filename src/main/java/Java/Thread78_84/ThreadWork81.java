package Java.Thread78_84;

/**
 * 龟兔赛跑
 *
 * 长度30米
 * 兔子一秒十米,跑十米,休眠十秒
 * 乌龟一秒一米,跑十米,休息一秒
 */
public class ThreadWork81 {
    public static void main(String[] args) {
        Tuzi tuzi = new Tuzi();
        WuGui wuGui = new WuGui();

        tuzi.start();
        wuGui.start();
    }
}

/**
 * 兔子
 */
class Tuzi extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 30; i++) {
            System.out.println("兔子跑" + i);
            try {
                //0.1秒一米
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //跑十米,休眠十秒
            if (i % 10 == 0 & i!= 30){
                try {
                    System.out.println("兔子跑了" + i + "米,兔子休息");
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("兔子到达终点");
    }
}

/**
 * 乌龟
 */
class WuGui extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 30; i++) {
            System.out.println("乌龟跑" + i);
            try {
                //1秒一米
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //跑十米,休眠一秒
            if (i % 10 == 0 & i!= 30){
                try {
                    System.out.println("乌龟跑了" + i + "米,乌龟休息");
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("乌龟到达终点");
    }
}