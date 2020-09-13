package Java.Object_8_20;

/*
 *练习
 * 1.编写教室类和学生类,通过测试创建对象进行测试
 */
public class WorkTest10 {
    public static void main(String[] args) {

        //类的实例化
        Student1 student1 = new Student1();
        student1.name = "qujianhua";
        student1.age = 18;
        student1.major = "大数据";
        student1.interests = "makelove";
        System.out.println(student1.say());
        student1.say2();
    }
}

class Student1{
    String name;
    int age;
    String major;
    String interests;

    public String say(){
        return name + age + major + interests;
    }

    public void say2(){
        System.out.println(name + age + major + interests);
    }
}
