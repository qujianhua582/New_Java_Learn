package Java.Collection_52_66;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * List集合接口的方法  可以直接使用for循环 结合size()和get() 进行遍历
 *
 * List是Collection的子接口 方法完全继承父接口Collection 并新增了其他方法
 *
 */
public class ListMothed58 {
    public static void main(String[] args) {
        List list = new ArrayList();
        List list1 = new ArrayList();

        //在某个index位置添加一个元素
        list.add(0,"张三");
        list.add("钱琪");
        list.add(0,"田八");
        list1.add("李四");
        list1.add("王五");

        //在某个index位置添加所有元素
        list.add(1,list1);

        //删除index位置的一个元素
        list.remove(0);

        //修改
        list.set(0,"赵六");

        //查询
        list.indexOf("赵六");
        list.lastIndexOf("赵六");

        //返回列表中指定位置的元素
        list.get(0);

        //截取 从一个位置,截取到另一个位置  左闭右开 返回List集合
        list.subList(0,1);

        //遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list.size()+"*********");

        //可以 从左向右 或 从右向左 或从任意位置向左 开始遍历 并且支持set()修改内容
        //集合.iterator() iterator.hasNext() iterator.next() 从左往右遍历
        //集合.listIterator(index 非从下标0开始,也可理解为要遍历从左往右的长度) iterator.hasPrevious() iterator.Previous() 从右往左遍历
        ListIterator iterator = list.listIterator(list.size()); //从后往前遍历

        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
