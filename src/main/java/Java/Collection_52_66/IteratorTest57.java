package Java.Collection_52_66;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 遍历集合的三种方法
 * ① toArray()  转数组
 * ② foreach  增强for循环  可遍历数组,集合等容器
 * ③ Iterator 迭代器(不安全)  只可遍历集合   iterator.remove() 还可删除指定元素
 */
public class IteratorTest57 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList();
        c.add("张三");
        c.add("李四");
        c.add("王五");

        //toArray()  转数组
        Object[] objects = c.toArray();

        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }


        System.out.println("***************************************");


        //foreach  增强for循环
        for(String s:c){
            System.out.println(s);
        }


        System.out.println("***************************************");


        //Iterator 迭代器
        Iterator iterator = c.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println("***************************************");


        //将Student对象存储到集合中
        Collection co = new ArrayList();
        co.add(new Student("张三",100));
        co.add(new Student("李四",90));
        co.add(new Student("王五",87));

        //将低于90分的删除 只能使用iterator.remove()  foreach只看查看不可修改
        Iterator iterator1 = co.iterator();
        while (iterator1.hasNext()){
            //强转
            Student s = (Student) iterator1.next();
            if (s.getScore()<90){
                iterator1.remove();
            }
        }

        for (Object o:co){
            System.out.println(o);
        }
    }
}


class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
