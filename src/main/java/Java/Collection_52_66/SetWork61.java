package Java.Collection_52_66;

import java.util.*;

/**
 * Set集合的练习  先正序排(使用TreeSet 实现Comparable 即自动排序),再倒序排(new Comparator())
 * new Comparator() 级别高
 *
 *
 * TreeSet 实现Comparable 即自动排序
 *
 * HashSet 如果要实现排序 再修改HashSet中的CompareTo()方法不合适,需动态排序,在括号中使用new Comparator()
 *
 */
public class SetWork61 {
    @SuppressWarnings("All")

    public static void main(String[] args) {
        TreeSet<Comparable> treeSet = new TreeSet();
        treeSet.add(new Book(1,"<<海底两万里>>",18762,23.9));
        treeSet.add(new Book(2,"<<朝花夕拾>>",11710,29.9));
        treeSet.add(new Book(3,"<<骆驼祥子>>",14611,18.4));
        treeSet.add(new Book(4,"<<海底两万里>>",8714,21.3));

        Iterator<Comparable> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        TreeSet<Comparable> treeSet1 = new TreeSet(new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                Book book = (Book) o1;
                Book book1 = (Book) o2;
                if (((Book) o1).getPrice()>((Book) o2).getPrice()){
                    return -1;
                }else if (((Book) o1).getPrice()<((Book) o2).getPrice()){
                    return 1;
                }else
                return 0;
            }
        });
        treeSet1.add(new Book(1,"<<海底两万里>>",18762,23.9));
        treeSet1.add(new Book(2,"<<朝花夕拾>>",11710,29.9));
        treeSet1.add(new Book(3,"<<骆驼祥子>>",14611,18.4));
        treeSet1.add(new Book(4,"<<海底两万里>>",8714,21.3));

        Iterator<Comparable> iterator1 = treeSet1.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}


class Book implements Comparable{
    private int id;
    private String name;
    private int salesount;
    private double price;

    public Book() {
    }

    public Book(int id, String name, int salesount, double price) {
        this.id = id;
        this.name = name;
        this.salesount = salesount;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salesount=" + salesount +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalesount() {
        return salesount;
    }

    public void setSalesount(int salesount) {
        this.salesount = salesount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Object o){
        //按销量从大到小排 如果销量相同则按售价从小到大排 还相同则按id
        Book book = (Book) o;
        /*if (this.salesount > book.salesount){
            return -1;
        }else if (this.salesount < book.salesount){
            return 1;
        }else
            return 0;*/
        return this.salesount-book.salesount;
    }
}