package Java.Collection_52_66;

import java.util.*;

/**
 * Map集合  key-value  键值对  键无法重复,值可以重复
 *
 * 遍历
 * ① keySet  键无法重复,所以返回值是一个Set集合
 * ② values  值可以重复,所以返回值是一个Collection集合
 * ③ entrySet 键无法重复,所以返回值是一个Entry<>对象的Set集合 getKey()  getValue()
 *
 * Map的的实现类
 * ① HashMap 无序
 * ② TreeMap 按key自动排序
 * ③ LinkedHashMap 有序,按添加顺序   比HashMap多维护了一层排序关系
 * ④ Properties 是Hashtable的子类  存储内容必须是String类型
 *
 *
 * HashMap 和 Hashtable 的关系     StringBuffer StringBuilder     Vector ArrayList
 * Hashtable 线程安全              StringBuffer 线程安全            Vector  线程安全
 * HashMap 线程不安全的             StringBuilder 线程不安全的       ArrayList 线程不安全的
 */
public class MapMethod62 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap();
        HashMap<Integer,String> hashMap1 = new HashMap();

        //添加
        hashMap.put(1,"张三");
        hashMap.put(2,"李四");
        hashMap.put(3,"王五");
        hashMap1.put(4,"赵六");
        hashMap1.put(5,"王八");
        hashMap.putAll(hashMap1); //将另一个Map集合添加到此集合

        //删除 通过 key 删除 value
        hashMap.remove(2);

        //清空
        //hashMap.clear();

        //修改 没有修改的方法 通过重复添加key就能修改值
        hashMap.put(1,"钱七"); //张三 -> 钱七

        //查询
        hashMap.get(1); //通过key获取value值 //钱七

        //获取所有的key 因为key不可重复,所以返回值是一个Set集合
        Set set = hashMap.keySet();
        Iterator iteratorSet = set.iterator();
        while (iteratorSet.hasNext()){
            System.out.println(iteratorSet.next());
        }

        //获取所有的value 返回值是一个Collection
        Collection<String> values = hashMap.values();
        Iterator<String> iteratorColl = values.iterator();
        while (iteratorColl.hasNext()){
            System.out.println(iteratorColl.next());
        }

        //Map无法使用Iterator 使用entrySet 返回值 是一个Entry的集合
        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
        for (Map.Entry<Integer, String> e:entries){
            System.out.println(e);
        }

    }
}
