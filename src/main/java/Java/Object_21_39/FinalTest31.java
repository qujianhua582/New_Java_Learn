package Java.Object_21_39;

/**
 * final: 修饰符 最终的
 *
 * 可以修饰:
 * ① 类:内部类和外部类  修饰的类不可以被继承
 * ② 方法: 被修饰的方法不可以被重写
 * ③ 变量: 包括属性和局部变量  修饰的变量不可被修改 也就是常量 常量名建议大写
 */
public class FinalTest31 {
    public static void main(String[] args) {

        final int a = 10;
        //a = 20; 不可被修改
    }
}

/**
 * 不可被继承
 */
final class Big{

}




class Big2{

    final public void test(){

    }
}
class Small extends Big2{
    /**
     * 不可被重写
     */
    /*@Override
    public void test(){

    }*/
}