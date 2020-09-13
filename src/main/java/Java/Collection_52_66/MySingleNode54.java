package Java.Collection_52_66;

/**
 * 自定义单向链表
 */
public class MySingleNode54 {
    public static void main(String[] args) {
        MySingleNode54 mySingleNode = new MySingleNode54();

        //添加
        mySingleNode.add("张三");
        mySingleNode.add("李四");
        mySingleNode.add("王五");

        System.out.println(mySingleNode.toString());

        //删除
        mySingleNode.remove("张三");
        System.out.println(mySingleNode.toString());

        //长度
        System.out.println(mySingleNode.size());
    }
    //用于记录第一个节点的值
    private Node first;
    //用于记录链表长度
    private int total;

    /**
     * 添加元素
     * @param o
     */
    public void add(Object o){
        //如果第一个节点为null 就把添加的元素放到第一个节点中,使指向下个节点的地址值为null
        if (first == null){
            first = new Node(o,null);
        }else {
            //如果不为空 先将第一个节点的地址值给新的节点
            Node node = first;
            //查找最后一个为空的节点 如果不为空 就用下一个值替换上一次赋的值
            while (node.next!=null){
                node = node.next;
            }
            //node.next 如果为空 证明是最后一个 将上个元素的地址值指向此对象
            node.next = new Node(o,null);
        }
        //元素个数+1
        total++;
    }

    /**
     * 删除
     * ① 要删除的元素是为空
     *     第一个元素 或 其他元素 是否为空  删除中间和最后一个都是将删除的上一个节点指向删除的下一个节点的地址
     * ② 要删除的元素不为空
     *     第一个元素 或 其他元素 是否匹配到
     */
    public void remove(Object o){
        //如果筛选要删除的元素为空
        if (o == null){
            //是否为第一个元素 如果第一个元素为空
            if (first.data == null){
                //都为空直接删除 使first的地址指向下一个节点的地址
                //这是将第一个下一个的地址给了第一个 所以两个地址值一样 是一块区域 原来的被清理
                first = first.next;
            }else {
                Node left = first; //将第一个给左边
                Node right = first.next; //将第一个的下一个给右边
                //循环到判断一个元素为空
                while (right.data!=null){
                    left = right;
                    right = right.next;
                }
                //删除
                left.next = right.next;
            }
        }else {
            //不可使用o.equals 为空调用会抛异常
            if (o.equals(first.data)){
                //如果匹配到 使first的地址指向下一个节点的地址
                first = first.next;
            }else {
                Node left = first; //将第一个给左边
                Node right = first.next; //将第一个的下一个给右边
                //循环到判断一个元素可以匹配
                while (!o.equals(right.data)){
                    left = right;
                    right = right.next;
                }
                //删除
                left.next = right.next;
            }
            total--;
        }
    }

    /**
     * 长度
     * @return
     */
    public int size(){
        return total;
    }


    /**
     * 遍历
     * @return
     */
    public String toString(){
        Object[] o = new Object[total];
        String s = "[";
        Node node = first;
        for (int i = 0; i < total; i++) {
            o[i] = node.data;
            node = first.next;
            s += o[i] + ",";
        }


        return s;
    }

    //定义一个内部类
    class Node{
        //记录添加的元素内容
        Object data;

        //用于记录下一个节点的地址
        Node next;

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}