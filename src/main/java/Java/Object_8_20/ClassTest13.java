package Java.Object_8_20;

public class ClassTest13 {
    public static void main(String[] args) {
       int m = 10;
       int n = 20;

       //交换
//       m = m ^ n;
//       n = m ^ n;
//       m = m ^ n;
       //使用方法交换
        swap(m,n); //使用方法无法交换? 因为上面的m,n和形参中的m,n不是一个
                   // 交换只是交换方法中的m,n 并不是main方法中的m,n
        System.out.println(m + " " + n);//调用方法时给方法赋得值叫实参

        Test3 test3 = new Test3();
        test3.swap2(test3);
        System.out.println(test3.m + " " + test3.n);//会调换 因为引用的同一地址值
    }


    /***
     *
     * @param m
     * @param n
     */
    public static void swap(int m,int n){//声明方法时给方法声明的叫形参
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;

        System.out.println(m + " " + n);
    }
}


class Test3{
    int m = 10;
    int n = 20;

    public void swap2(Test3 test3){
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;
    }
}