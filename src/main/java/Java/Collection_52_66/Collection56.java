package Java.Collection_52_66;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Collection : List接口 Set接口
 * Map
 *
 * remove contains 等 默认比较的都是地址值  如果要比较内容数据,需要重新 equals() 和 hashcode() 方法
 */
public class Collection56 {

    public static void main(String[] args) {
        Collection c = new ArrayList();
        Collection c1 = new ArrayList();

        /**
         * 添加
         */
        //添加一个
        c.add("张三"); //张三

        c1.add("李四"); //李四
        c1.add("王五"); //李四 王五
        c1.add("张三"); //李四 王五 张三

        //将另一个集合做为一个整体添加进去 添加的是地址 动c1 c里的整体c1也会变动
        c.add(c1);  //张三 [李四,王五,张三]

        //添加多个 将另一个集合的元素全部添加进去  并集
        c.addAll(c1); //张三 [李四,王五,张三] 李四 王五 张三

        /**
         * 删除
         */
        //删除一个
        c1.remove("张三"); //李四 王五

        //删除多个 将此集合与另一个集合的重合的元素全部删除  交集 this = this - this 交 other
        //即使是一个整体集合 只要内容重复 就清除
        c.removeAll(c1); //张三 [李四,王五,张三] 李四 王五 张三 -> 张三 [李四,王五] 张三

        //将集合中的元素清除
        c1.clear(); //张三 [李四,王五] 张三 -> 张三 [] 张三

        /**
         * 查询
         */
        //判断是否包含在集合中
        c.contains("张三");

        //判断c1中的元素是否全部包含在c集合中  即 c1 为 c 的子集
        c.containsAll(c1);

        /**
         * 长度,遍历
         */
        //长度
        c.size();

        //遍历 可以转数组
        Object[] objects = c.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }


    }
}
