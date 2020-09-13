package Java.Object_21_39;

public class WorkTest38 {
    public static void main(String[] args) {

        Runnable[] runnables = new Runnable[5];
        runnables[0] = new Person6();
        runnables[1] = new Car();
        runnables[2] = new Dog();
        runnables[3] = new Car();
        runnables[4] = new Dog();
        for (int i = 0;i < runnables.length;i++){
            runnables[i].run();
        }

    }
}

interface Runnable{
    void run();
}

class Person6 implements Runnable{

    @Override
    public void run() {

        System.out.println("走路~");
    }
}

class Car implements Runnable{

    @Override
    public void run() {

        System.out.println("开车~");
    }
}

class Dog implements Runnable{

    @Override
    public void run() {

        System.out.println("乱窜~");
    }
}