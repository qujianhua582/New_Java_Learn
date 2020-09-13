package Java.Collection_52_66;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set集合  不重复,自动去重
 *
 * Set中的方法和Collection完全一致  没有新增方法
 *
 * 实现类
 *  ① HashSet : 完全无需
 *  ② TreeSet : 有序,自动大小顺序排列,和添加顺序无关,如添加的是对象,必须实现Comparable
 *  ③ LinkedHashSet : 存储和添加顺序无关,可以保证添加顺序(就是添加时候的顺序和遍历的顺序一致),比HaseSet多维护了一层顺序,所以效率比HashSet较低
 *
 *
 *  结论:
 *  ①如果要使用排序,使用TreeSet集合,但必须实现Comparable
 */
public class SetTest60 {
    /**
     * HashSet
     */
    @Test
    public void hashSet(){
        Set set = new HashSet();

        set.add("张三");
        set.add("李四");
        set.add("王五");
        set.add("张三");

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()); //无序的
        }
    }

    /**
     * TreeSet
     */
    @Test
    public void treeSet(){
        Set set = new TreeSet();

        set.add("zhang");
        set.add("li");
        set.add("wang");
        set.add("wang");

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()); //自动按字典顺序 从小到大排列
        }
    }
}
