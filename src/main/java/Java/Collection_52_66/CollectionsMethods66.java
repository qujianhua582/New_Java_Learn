package Java.Collection_52_66;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 集合工具类 Collections
 */
public class CollectionsMethods66 {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        ArrayList arrayList1 = new ArrayList();

        //将内容添加到集合中
        Collections.addAll(arrayList,"张三","李四","王五");
        Collections.addAll(arrayList1,"张三");


        //二分查找
        int index = Collections.binarySearch(arrayList, "李四"); //1
        System.out.println(index);

        //判断两个集合中是否有相同的元素,如果没有返回true
        Collections.disjoint(arrayList,arrayList1); //true

        //返回集合中最大的元素值
        Collections.max(arrayList);

        //返回集合中最小的元素值
        Collections.min(arrayList);


        /**
         * 排序1 要排序的集合中的对象实现Comparable接口,并重写CompareTo()方法
         */
        ArrayList<Phone> arrayList2 = new ArrayList<>();
        arrayList2.add(new Phone("iphone",5399));
        arrayList2.add(new Phone("xiaomi",1999));
        arrayList2.add(new Phone("oppo",2399));

        Collections.sort(arrayList2); //如果对象没有实现Comparable会报错,无法排序

        for (int i = 0; i < arrayList2.size(); i++) {
            System.out.println(arrayList2.get(i));
        }

        /**
         * 排序2 手动自定义排序器 new Comparator()
         */
        System.out.println("***************************");

        ArrayList<Phone1> arrayList3 = new ArrayList<>();
        arrayList3.add(new Phone1("iphone",5399));
        arrayList3.add(new Phone1("xiaomi",1999));
        arrayList3.add(new Phone1("oppo",2399));

        Collections.sort(arrayList3, new Comparator<Phone1>() {
            @Override
            public int compare(Phone1 o1, Phone1 o2) {
                if (o2.getPrice()-o1.getPrice() > 1) {
                    return 1;
                }else if (o2.getPrice()-o1.getPrice() < 1) {
                    return -1;
                }else
                    return 0;
            }
        }); //如果对象没有实现Comparable会报错,无法排序

        for (int i = 0; i < arrayList2.size(); i++) {
            System.out.println(arrayList2.get(i));
        }
    }
}

class Phone implements Comparable<Phone>{
    private String name;
    private double price;

    public Phone() {
    }

    public Phone(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Phone o) {
        if (o.price-this.price > 1) {
            return 1;
        }else if (o.price-this.price < 1) {
            return -1;
        }else return 0;
    }
}


class Phone1{
    private String name;
    private double price;

    public Phone1() {
    }

    public Phone1(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
