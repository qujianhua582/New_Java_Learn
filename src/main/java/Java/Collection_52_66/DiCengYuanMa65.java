package Java.Collection_52_66;

import java.util.HashSet;

/**
 * Set的底层实现
 *
 * HashSet: HashSet的底层是HashMap, 添加的内容作为Key,所有的Value都共享同一个Object类型的常量对象PRESENT
 * LinkedHashMap: LinkedHashMap的底层是LinkedHashMap,添加的内容作为Key,所有的Value都共享同一个Object类型的常量对象PRESENT
 * TreeSet: 底层是TreeMap,添加的内容作为Key,所有的Value都共享同一个Object类型的常量对象PRESENT
 *
 *
 * Iterator的底层实现  Itr是Iterator接口的实现类
 * ListIterator的底层实现  ListItr是ListIterator接口的实现类
 * .iterator()  实际是new Itr()
 *
 *
 * 关于 迭代器 和 foreach 的多线程并发问题
 * 在迭代和遍历时,使用集合的remove方法 会报错误
 */
public class DiCengYuanMa65 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
    }
}
