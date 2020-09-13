package Java.Collection_52_66;

/**
 * 再手写一次自定义单向链表
 */
public class MyNodeTest55 {
    private Node first;
    private int total;

    /**
     * 添加
     */
    public void add(Object o){
        if (first == null){
            first = new Node(o,null);
        }else {
            Node node = first;
            while (node.next!=null){
                node = node.next;
            }
            node.next = new Node(o,null);
        }
        total++;
    }


    /**
     * 删除
     */
    public void remove(Object o){
        if (o == null){
            if (first.o == null){
                first = first.next;
            }else {
                Node left = first;
                Node right = first.next;
                while (right.o!=null){
                    left = right;
                    right = right.next;
                }
                left.next = right.next;
            }
        }else {
            if (o.equals(first.o)){
                first = first.next;
            }else {
                Node left = first;
                Node right = first.next;
                while (!o.equals(first.o)){
                    left = right;
                    right = right.next;
                }
                left.next = right.next;
            }
        }
        total--;
    }

    /**
     * 遍历
     */
    public String toString(){
        Object[] o = new Object[total];
        String s = "";
        Node node = first;
        for (int i = 0; i < total; i++) {
            o[i] = node.o;
            node = node.next;
            s += o[i]+",";
        }
        return s;
    }

    class Node{
        private Object o;
        private Node next;


        public Node(Object o,Node next) {
            this.next = next;
            this.o = o;
        }
    }

    public static void main(String[] args) {
        MyNodeTest55 myNodeTest55 = new MyNodeTest55();

        myNodeTest55.add("q");
        myNodeTest55.add("j");
        System.out.println(myNodeTest55.toString());

        myNodeTest55.remove("q");
        System.out.println(myNodeTest55.toString());


    }
}
