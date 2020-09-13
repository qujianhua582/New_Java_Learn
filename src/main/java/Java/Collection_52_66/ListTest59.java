package Java.Collection_52_66;

import org.junit.Test;

import java.util.*;

/**
 * List接口的常见实现类
 *
 * ① Vector: 动态数组 旧版 线程安全
 *        初始长度为10
 *        动态扩容机制: 每次扩容上次长度的2倍
 * ② ArrayList: 动态数组 新版 线程不安全
 *        初始长度为10
 *        动态扩容机制: 每次扩容上次长度的1.5倍
 * ③ LinkedList: 双向链表 双端队列
 * ④ Stack: 动态数组 栈,又是Vector的子类
 *
 *
 * Stack(栈): 是Vector的类  先进后出(First In Last Out) FILO 或 后进先出(Last In First Out) LIFO
 *      方法:
 *      ① 压栈: push() 添加元素,先进在下 后进在上
 *      ② 弹栈: pop() 删除栈顶元素 删除最后添加的元素
 *      ③ 查询最后添加: peek() 查看此堆栈顶部的对象，而不从堆栈中删除它
 *      ④ 是否为空: empty() 测试此堆栈是否为空
 *      ⑤ 搜索: search(Object o)
 *      ⑥ 迭代器: iterator
 *
 * Queue(队列): 接口, LinkedList是队列的实现类 先进先出(First In First Out) FIFO
 *      方法:
 *      ① 添加: add() 添加元素
 *              offer() 添加元素
 *      ② 删除: remove() 删除队列的头
 *      ③ 查询头部元素: peek() 查询队列头部元素
 *                    element() 查询队列头部元素
 *      ④ 查询并删除头部元素: poll() 查询并删除队列头部元素
 *      ⑤ 迭代器: iterator
 *
 *
 * Deque(双端队列): 接口LinkedList是双端队列的实现类,支持两端元素插入和移除的线性集合
 *      方法:
 *      ① 添加: add() 添加元素
 *              addFirst() 添加元素到队列的开头
 *              addLast() 添加元素到队列的结尾
 *              offerFirst() 添加元素到队列的开头
 *              offerLast() 添加元素到队列的结尾
 *      ② 删除: remove() 删除队列的头
 *              removeFirst() 删除队列的头
 *              removeLast() 删除队列的尾
 *              remove(Object o) 删除第一次出现的元素
 *      ③ 查询: peek() 查询队列头部元素
 *              peekFirst() 查询队列头部元素
 *              peekLast() 查询队列的尾部元素
 *              getFirst() 查询队列头部元素
 *              getLast() 查询队列的尾部元素
 *      ④ 查询并删除: pollFirst() 查询并删除队列头部元素
 *                   pollLast() 查询并删除队列尾部元素
 *      ⑤ 迭代器: iterator  正向迭代
 *                descendingIterator  反向迭代
 *
 *
 * 数组和链表的区别:
 *      ①数组对索引相关的操作效率比较高,链表对索引相关的操作效率比较低
 *      ②数组插入,删除比较低,链表插入,删除比较高效
 *      涉及到索引用数组结构
 */
public class ListTest59 {
    /**
     * Stack(栈)
     */
    @Test
    public void stack() {
        Stack stack = new Stack();

        stack.push("张三"); //张三
        stack.push("李四"); //李四 张三

        //删除顶部元素
        stack.pop(); //张三

        //查看顶部元素
        System.out.println(stack.peek()); //张三

        //返回下标基于1的数值 从1开始 非0
        System.out.println(stack.search("张三")); //1

        //迭代
        Iterator iterator = stack.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    /**
     * Queue(队列)
     */
    @Test
    public void queue() {
        Queue queue = new LinkedList();

        queue.add("张三"); //张三
        queue.add("李四"); //张三 李四
        queue.offer("王五"); //张三 李四 王五

        //删除队列的头部元素
        queue.remove();

        //查询并删除头部元素
        System.out.println(queue.poll()); //头部是李四 并删除

        //查询队列的头部元素
        System.out.println(queue.peek()); //王五
        System.out.println(queue.element()); //王五

        //栈 push pop peek empty search
        //队列 add offer   remove poll  peek element

        //迭代
        Iterator iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    /**
     * Deque(双端队列)
     */
    @Test
    public void deque(){
        Deque deque = new LinkedList();

        deque.addFirst("张三"); //张三
        deque.addFirst("李四"); //李四 张三
        deque.addLast("王五"); //李四 张三 王五

        //删除
        deque.removeFirst(); //张三 王五
        deque.removeLast(); //张三

        //查询
        deque.peekFirst(); //张三
        deque.peekLast(); //张三

        //查询并删除
        deque.pollFirst(); //查询到张三 并 删除


        //迭代
        Iterator iterator = deque.iterator(); //正向迭代
        Iterator iterator1 = deque.descendingIterator(); //反向迭代
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
