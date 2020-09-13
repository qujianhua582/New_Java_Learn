package Java.Other_40_47;

/**
 * VirtualMachineError 虚拟机错误
 * 演示栈和堆异常
 * StackOverflowError 栈溢出
 * OutOfMemoryError 内存溢出
 */
public class StackHeapException42 {
    public static void main(String[] args) {
        stackException();
    }

    /**
     * 栈溢出异常  自己调用自己   StackOverflowError
     */
    public static void stackException(){
        //stackException();
        HeapException();
    }

    /**
     * 堆溢出异常  创建一个非常大的数据 以在内存中申请非常大的空间
     */
    public static void HeapException(){
        int[] arr = new int[Integer.MAX_VALUE]; //Integer.MAX_VALUE表示整数最大值
    }
}
