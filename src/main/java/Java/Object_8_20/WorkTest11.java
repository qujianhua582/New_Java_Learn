package Java.Object_8_20;

public class WorkTest11 {
    public static void main(String[] args) {

        Person1 person1 = new Person1();
        person1.name = "qujianhua";
        person1.age = 18;
        person1.sex = 0;
        System.out.println(person1.age);

        person1.study();
        person1.showAge();
        System.out.println(person1.addAge(2));

        //圆的面积
        Circle circle = new Circle();
        circle.r = 4;
        System.out.println(circle.circle());
    }
}


class Person1{
    String name;
    int age;
    int sex;

    public void study(){

        System.out.println("studying");
    }

    public void showAge(){

        System.out.println(age);
    }

    public int addAge(int i){
        age = age+i;
        return age;
    }
}


class Circle{
    double r;

    public double circle(){
        return Math.PI*r*r;
    }
}