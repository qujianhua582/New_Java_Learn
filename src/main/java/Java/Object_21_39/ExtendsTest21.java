package Java.Object_21_39;

/**
 * 继承Person类 关键字 extends  单继承,每次只能继承一个类,但一个父类可以有多个子类
 *
 * 继承的作用:
 * ① 代码的复用
 * ② 代码的扩展
 * ③ is-a的关系 Student is a Person;
 *
 * 子类(SubClass): 又名派生类
 * 父类(SuperClass): 又名超类,基类
 *
 * ① 继承父类会默认调用父类的无参构造 如果父类定义了有参构造,并没有手动定义无参构造则会报错
 * ② 或者在子类的构造方法中使用super(参数) 调用父类的有参构造,如果父类没有无参构造,子类也不能定义无参构造
 *    !!!!-----也就是说子类必须调用父类的构造器-----!!!!------------|
 *                                                            |
 * ③ super() 只能放在子类构造器的第一行 同时只能调用一次             |
 * ④ 每个子类只能有一个直接父类                                   |
 *                                                            |
 * !-继承会继承父类的所有属性和方法,但是构造方法不会被继承-!            |
 *                                                            |
 * 如果父类没有定义无参构造,则子类必须显示的调用父类的有参构造-----------|
 */
public class ExtendsTest21 {
    public static void main(String[] args) {
        Person person = new Person("qujianhua",18);
        System.out.println(person.getName()+person.getAge());

        Student student = new Student("qujianhua",18,100);
        System.out.println(student.getName()+student.getAge()+student.getScore());
    }
}

class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
}

/**
 * 继承Person类 关键字 extends
 * ① 继承父类会默认调用父类的无参构造 如果父类定义了有参构造,并没有手动定义无参构造则会报错
 * ② 或者在子类的构造方法中使用super(参数) 调用父类的有参构造,如果父类没有无参构造,子类也不能定义无参构造
 * ③ super() 只能放在子类构造器的第一行 同时只能调用一次
 * ④ 每个子类只能有一个直接父类
 *
 * !-继承会继承父类的所有属性和方法,但是构造方法不会被继承-!
 */
class Student extends Person{

    private int score;

    public Student() {
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }
}