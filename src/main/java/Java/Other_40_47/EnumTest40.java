package Java.Other_40_47;

/**
 * enum 枚举             格式  enum 枚举名{}   枚举类型直接用类名.调用
 * 要点:
 * ① 限制使用者随意的创建对象 -----> 将构造器私有化
 * ② 把有限的几个对象,预先创建好,供使用者使用
 *
 *
 * 特点:
 * ① 枚举中类型 默认是 public static final 所以可以直接用 枚举名称. 调用
 * ② 枚举类型的构造器一定都是私有的
 * ③ 枚举常量列表必须在第一行 中间可以用,分隔  结尾用;
 * ④ 常量列表中的成员中间用,分隔  如果常量列表后还有其他的成员 ;不可以省略
 * ⑤ 所有枚举类型 有一个java.lang.Enum 父类 ,枚举类型不可以继承其他类
 * ⑥ 枚举可以实现接口
 */
public class EnumTest40 {
    public static void main(String[] args) {

        EnumTest enumTest = EnumTest.SPRING;
        EnumTest enumTest1 = EnumTest.AUTO;

        //
        EnumTest2 enumTest2 = EnumTest2.TWO;
        System.out.println(EnumTest2.TWO);

        //Enum中自带的values方法 返回一个数组
        EnumTest2[] values = EnumTest2.values();
        for (EnumTest2 e:values){
            System.out.println(e);
        }

    }
}

/**
 * 枚举原理代码
 */
class EnumTest{

    //在外面不可以使用new创建对象,需要把这个设为静态 常量
    public static EnumTest SPRING = new EnumTest();
    public static EnumTest AUTO = new EnumTest();
    //将构造器私有化
    private EnumTest() {
    }
}


enum EnumTest2{

    ONE,TWO("屈建华"),THREE;
    private String name;

    EnumTest2() {
    }

    EnumTest2(String name) {
        this.name = name;
    }

    //此处重写的是Enum中的toString 并非Object中的
    @Override
    public String toString() {
        return "EnumTest2{" +
                "name='" + name + '\'' +
                '}';
    }
}