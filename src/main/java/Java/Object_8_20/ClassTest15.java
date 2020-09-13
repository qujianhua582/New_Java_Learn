package Java.Object_8_20;

/**
 * 封装性
 * 创建类的对象以后,我们可以使用对象.属性的方式调用或设置属性的值,但赋值时需要考虑到数据类型和储值范围
 * 所有需要加上限制条件,只能在方法中加入限制(setXXX()),同时,应禁止通过对象.属性的方式给属性赋值(private)
 * 此外,限制之后为了能调用此属性,应提供获取属性的方法(getXXX())
 *
 * 狭义:将类的属性私有化,同时提供公共的getXXX()和setXXX()方法来获取和设置此属性
 *
 * 权限修饰符4种: private < 缺省 < protected < public 可修饰属性,方法,构造器,内部类
 * privete: 只可在同一个类中调用
 * 缺省: 同一个类或同一个包中使用  还可修饰类
 * protected: 同一个类或同一个包中使用或不同包的子类
 * public: 任何地方  还可修饰类
 */
public class ClassTest15 {
    public static void main(String[] args) {
        Person3 person3 = new Person3(17,"屈建华");
        person3.setAge(18);
        System.out.println(person3.getAge());
    }
}


class Person3{
    private int age;

    //构造方法
    public Person3(int age,String name) {
        this.age = age;
        this.name = name;
    }

    private String name;

    //command + n    get and set
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0){
            System.out.println("输出有误");
        }else
        this.age = age;
    }

    public void show(){
        System.out.println("展示");
    }
}