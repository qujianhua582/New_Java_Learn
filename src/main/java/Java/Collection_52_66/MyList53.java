package Java.Collection_52_66;

import java.util.Arrays;

/**
 * 自定义不定长度的数组
 */
public class MyList53 {
    public static void main(String[] args) {

        MyList myList = new MyList();

        //添加
        myList.add("张三");
        myList.add(null);
        myList.add("李四");
        myList.add("王五");


        //删除
        myList.remove("李四");

        //查找
        System.out.println(myList.find("王五")); //删除李四后 为 2

        //长度
        System.out.println(myList.size());

        //遍历
        System.out.println(myList.toString());
    }
}


class MyList{
    private Object[] object;
    private int total; //用于记录数组长度

    //只在创建类的时候调用构造器 执行一次

    public MyList() {
        object = new Object[2];
    }

    /**
     * 添加
     * @param o 要添加的元素
     */
    public void add(Object o){
        //如果要添加的元素个数已经大于等于数组长度 需要复制此数组至新数组
        if (total >= object.length){
            //拷贝数组的内容到另一数组
            object = Arrays.copyOf(object,object.length*2);
        }
        object[total++] = o;
    }

    /**
     * 删除
     * @param o
     */
    public void remove(Object o){
        int index = -1;
        //查找 可能要查找的值为null 或 不存在 判断为空只能用 == 不能使用equals 会抛空指针异常
        //判断数组为空 需判断所有,判断o只需判断一次
        if (o == null){
            for (int i = 0; i < total; i++) {
                //如果o为空 用 == 判断, 所以不会出现空指针
                if(o == (object[i])){
                    index = i;
                    break;
                }
            }
            System.arraycopy(object,index+1,object,index,total-index-1);
            object[--total] = null;
        }else {
            //使用total 替换 object.length 因为可能数组没有填充满 未填写的均为null,使用equals会抛空指针异常
            for (int i = 0; i < total; i++) {
                //如果o为空 肯定进不来 , 所以不会出现空指针
                if(o.equals(object[i])){
                    index = i;
                }
            }
            System.arraycopy(object,index+1,object,index,total-index-1);
            object[total-1] = null;
            total = total - 1;
        }
    }

    /**
     * 查找
     * @param o
     * @return
     */
    public int find(Object o){
        int index = -1;

        if (o == null){
            for (int i = 0; i < total; i++) {
                //如果o为空 用 == 判断, 所以不会出现空指针
                if(o == (object[i])){
                    index = i;
                }
            }
            return index;
        }else {
            for (int i = 0; i < total; i++) {
                //如果o为空 用 == 判断, 所以不会出现空指针
                if(o.equals(object[i])){
                    index = i;
                }
            }
            return index;
        }
    }

    /**
     * 长度
     * @return
     */
    public int size(){
        return total;
    }

    //遍历
    public String toString(){
        String s = "[";
        for (int i = 0; i < total; i++) {
            if (i == 0){
                s += object[i]+",";
            }else if (i == total-1){
                s += object[i]+"]";
            }else
                s += object[i]+",";
        }
        return s;
    }
}