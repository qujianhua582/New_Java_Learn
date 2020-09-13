package Java.Other_40_47;

/**
 * 语法结构
 *
 * try{
 *     可能发生异常的代码
 * }catch(异常类型1 异常名称){
 *     捕获到异常后处理的代码:①什么也不写 ②打印异常 ③其他的处理方式
 * }catch(异常类型2 异常名称){
 *     捕获到异常后处理的代码:①什么也不写 ②打印异常 ③其他的处理方式
 * }finally{
 *     无论是否发生异常,也不管是否可以捕获异常,都要执行的代码块
 * }
 *
 *
 * 顺序执行,小的在上,大的在下
 * 如果所有的catch都无法捕获,会自动上抛
 */
public class TryCatchTest44 {
    public static void main(String[] args) {
        try {
            int[] a = new int[-5];
        } catch (Exception e) {
            System.out.println("数组长度不能为负数");
        } finally {
            System.out.println("都会执行");
        }


        System.out.println(getNum()); //40 执行try后没有结束 执行了finally
    }


    /**
     * 当 finally 和 return 一起出现
     * ① finally 中有return 返回值就是finally的值
     * ② finally 中没有return 返回值就是try或catch中的值
     */
    public static int getNum(){
        int i = 10;
        try{
            i = 20;
            return i;
        }catch (Exception e){
            i = 30;
            return i;
        }finally {
            i = 40;
            return i;
        }
    }
}

