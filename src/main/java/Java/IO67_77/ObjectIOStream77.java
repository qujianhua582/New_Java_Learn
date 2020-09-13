package Java.IO67_77;

import java.io.*;
import java.util.ArrayList;

/**
 * 对象IO流
 *
 * 被序列化的对象必须实现Serializable 否则无法序列化
 *
 * ObjectInputStream
 * ObjectOutputStream
 *
 * 如果一旦对象类内容更改 便再次反序列化 因为序列化ID是随机产生的
 * 所以实现序列化是应使用 private static final long serialVersionUID = 1L;
 *
 * 属性如果不实现序列化
 * ① 类中静态的属性或方法无法被序列化 因为序列化是针对对象的 而static是属于类,所有对象共享的
 * ② 使用transient修饰属性
 */
public class ObjectIOStream77 {
    public static void main(String[] args) {
        Person person = new Person("张三",18,'男');
        Person person1 = new Person("小芳",17,'女');
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(person);
        arrayList.add(person1);

        //序列化
        try(
                ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("/Users/qujianhua/shjjj.txt"))
                ){
            for(Person a:arrayList){
               ois.writeObject(a);
            }
        }catch (IOException o){
            System.out.println("异常");
        }


        //反列化
        try(
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/qujianhua/shjjj.txt"))
        ){
                System.out.println(ois.readObject());
        }catch (IOException | ClassNotFoundException o){
            System.out.println("异常");
        }
    }
}


class Person implements Serializable{
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private transient char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}