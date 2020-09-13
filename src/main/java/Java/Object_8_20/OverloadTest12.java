package Java.Object_8_20;

public class OverloadTest12 {

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.test();
        test2.test(1);//有一个参数首先选择有一个参数的 没有的话会自动选择可变形参
        test2.test(1,2,3);
    }
}


/**
 * 重载:同一个类中,并且同一个方法名,参数类型不同 构成重载
 *     与返回值类型 权限修饰符(public)无关
 *     可变长度参数的方法和数组不构成重载
 */
class Test{
    //重载
    public void test(){
        System.out.println(1);
    }

    public void test(int i){
        System.out.println(2);
    }

    public void test(int i,char j){
        System.out.println(3);
    }

    public void test(char j,int i){
        System.out.println(4);
    }

    //不构成重载
    /*public void test(int j,char i){

    }*/
    //不构成重载
    /*public int test(){
        return 1;
    }*/

    public void test(String ... str){
        System.out.println(5);
    }
}

class Test2{
    //都构成重载
    public void test(int i){
        System.out.println(1);
    }

    //可变形参 需要放在形参最后一个
    public void test(int... i){
        System.out.println(2);
    }

    public void test(int i,String ...j){
        System.out.println(3);
    }
}