package Java.Object_8_20;

/**
 * 构造方法 construct 作用: 创建对象
 * 定义方式: 权限修饰符 类名(参数){}
 *
 * ① 如果不创建有参构造方法,系统会默认有一个无参的构造方法
 * ② 如果创建了有参构造方法,系统则不提供无参的构造方法
 * ③ 相同类的有参和无参的构造方法构成重载
 * ④ 构造方法没有返回值 也不用使用void,也不用使用static
 *
 * 对类中属性的赋值方式
 * ① 默认值
 * ② 定义时赋值 int age = 18;
 * ③ 构造方法中进行赋值 Person p = new Person(18);
 * ④ 对象.方法(.setXXX(18))或对象.属性(.age = 18)进行赋值
 *
 * 这些的执行顺序为 ① - ② - ③ - ④
 * ①②③ 在执行中只调用一次 ④可以根据用户需求多次调用
 */
public class ConstructorTest17 {
    public static void main(String[] args) {
        Person4 person4 = new Person4(14);//new 后面的就构造器 作用是创建类的对象
        System.out.println(person4.age);

        char[] a = new char[]{'1'};
        System.out.println(a); //直接输出char类型的数组,输出的结果是把数组遍历
    }
}


class Person4 {

    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //无参构造方法
    public Person4(){
        this.age = age;
    }

    //有参构造方法
    public Person4(int age){
        this.age = age;
    }
}