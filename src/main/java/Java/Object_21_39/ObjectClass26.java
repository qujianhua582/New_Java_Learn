package Java.Object_21_39;

import java.util.Objects;

/**
 * Object 是所有类的父类
 * Object部分方法示范
 * ① toString() 打印一个对象默认调用toString方法 可用重写toString方法
 * ② getClass() 返回此Object的运行时的类
 * ③ equals() 使用 --> boolean equals (Object obj){}
 *    !!! 如果没有重写equals()方法 是和 == 相同的比较方式   ==比较的是对象的地址值 !!!
 * ④ hashCode() 使用 --> int hashCode (无参){}  返回该对象的哈希码值
 *    两个对象的hashCode值一样 但是对象可能不一样 例如:BB 和 Aa 的hashCode值是一样的
 *    两个对象的hashCode值不一样,那么对象肯定不一样
 *    两个对象一样,hashCode值肯定一样
 *
 */
public class ObjectClass26 {
    public static void main(String[] args) {
        Object[] objects = new Object[5];
        int[] a = new int[1];
        objects[0] = 1;
        objects[1] = "QUJIANHUA";
        objects[2] = 'c';
        objects[3] = a; //数组
        objects[4] = new Kun(); //对象


        //---------Object方法示范--------
        Object object = new Object();
        System.out.println(object.getClass()); //运行时类型
        System.out.println(object.toString()); //默认返回 类名@对象的哈希码无符号16位值
        System.out.println(object); //与上一条数据是一致的

        Kun kun = new Kun();
        System.out.println(kun); //默认调用toString方法

    }
}

class Kun{

    private String name = "qujianhua";
    private int age = 18;

    @Override
    public String toString() {
        return "Kun{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //判断地址值是否一致 如果不一致 两个对象肯定不同
        if (o == null || getClass() != o.getClass()) return false; //如果要比较的对象为空,无需判断this 如果this为空调用方法会报空指针异常
        // 或者两者运行时返回的类不一致 返回false
        Kun kun = (Kun) o; //向下转型
        return age == kun.age &&
                Objects.equals(name, kun.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
