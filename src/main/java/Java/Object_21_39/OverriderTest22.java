package Java.Object_21_39;

/**
 * 重写的要求:
 * ①子类重写的方法名必须和父类被重写的方法名相同
 * ②子类重写发方法的形参列表必须和父类被重写的方法的形参列表相同
 * ③子类重写的方法的返回值类型必须和父类被重写的方法的返回值类型相同
 *   如果是基本数据类型 子类返回值类型必须等于父类的返回值类型
 *   如果是引用数据类型 子类返回值类型可以小于等于父类发返回值类型
 * ④子类重写的方法的修饰符 >= 父类被重写的方法的权限修饰符
 */
public class OverriderTest22 extends Person1{
    public static void main(String[] args) {

    }

    /**-------------------------------------------
     * 错误
     */
    /*@Override
    public String test(){
        return "";
    }*/

    /**
     * 正确   返回值类型为基本数据类型时,返回值类型必须一致
     */
    @Override
    public int test(){
        return 1;
    }

    /**------------------------------
     * 正确   返回值类型为引用数据类型时,子类返回值类型必须小于等于父类
     *       String 是 Object 的子类
     */
    @Override
    public String test2(){
        return "";
    }

    /**------------------------------
     * 错误
     */
    /*@Override
    private void test3(){
        return;
    }*/


    /**
     * 权限修饰符 必须大于等于父类
     */
    @Override
    public void test3(){
        return;
    }
}


class Person1{
    public int test(){
        return 1;
    }

    public Object test2(){
        return 1;
    }

    protected void test3(){
        return;
    }
}