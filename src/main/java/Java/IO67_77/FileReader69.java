package Java.IO67_77;

import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader 字符输入流
 */
public class FileReader69 {
    public static void main(String[] args) throws IOException {
        //创建字符输入流
        FileReader fr = new FileReader("/Users/qujianhua/Documents/无标题.txt");

        //定义字符数组
        char[] chars = new char[1024];
        //定义变量记录每次读取的字符长度
        int len;
        //开始循环读取
        while ((len = fr.read(chars))!= -1){
            System.out.print(new String(chars,0,len));
        }

        //关闭流
        fr.close();
    }
}
