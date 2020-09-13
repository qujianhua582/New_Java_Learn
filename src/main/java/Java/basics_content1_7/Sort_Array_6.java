package Java.basics_content1_7;

public class Sort_Array_6 {
    public static void main(String[] args) {

        int[] arr = new int[]{1,3,2,7,4};
        qucikSort(arr,0,arr.length-1);
    }

    /*
     *冒泡排序 相邻两个数字去比较大小 满足条件位置互换 每次循环比较都能找到这次循环中的最大值
     * 外层循环表示一共需要循环几次 次数为长度-1次
     * 1. 内层循环表示每次循环需要比较几次 外层循环也多 内层比较次数就越少 ->
     * 2. 外层循环一次 内层循环需比较长度-1次 第二次需比较 长度-1-第几次循环
     */
    public static void test4(int[] array){
        for (int i = 0;i < array.length-1;i++){
            for (int j = 0;j < array.length-1-i;j++){
                if(array[j] > array[j+1]){
                    //交换位置
                    array[j] = array[j] ^ array[j+1];
                    array[j+1] = array[j+1] ^ array[j];
                    array[j] = array[j] ^ array[j+1];
                }
            }
        }

        for (int res : array){
            System.out.println(res);
        }
    }

    /*
    快速排序
     * 取出数组第0个数据
     * 从数组最右边开始遍历，如果遍历位置的数据比第0个位置的数据小，指针停止移动
     * 改变遍历方向，从左边开始开始遍历，如果发现左边的数据比第0个位置的数据大，指针停止移动
     * 将两位置数字互换
     * 循环2、3步骤直到左右遍历到的下标重合
     * 将取出的第0个位置的值赋值给循环结束后左右指针停留下的位置
     */
    public static void qucikSort(int arr[],int start,int end){
        if (start >= end){
            return;
        }
        //最左边的指针
        int left = start;
        //最右边的指针
        int ritght = end;
        //基准数值 取首位
        int key = arr[start];

        while (left<ritght){
            //从右边开始 如果值 比 基准值大 指针就依次向左  并且左指针要小于右指针
            while (key<=arr[left]&&left<ritght){
                ritght--;
            }
            //从左边开始 如果值 比 基准值小 指针就依次向右  并且左指针要小于右指针
            while (key>=arr[left]&&left<ritght){
                left++;
            }
            //并且左指针要小于右指针 就交换两个指针对应值的位置
            if (start<ritght){
                arr[left] = arr[left] ^ arr[ritght];
                arr[ritght] = arr[left] ^ arr[ritght];
                arr[left] = arr[left] ^ arr[ritght];
            }
        }

        System.out.println(arr[start]);
        System.out.println(key);
        System.out.println(arr[left]);
    }
}
