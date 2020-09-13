package Java.IO67_77;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * BufferedInputStream: 字符缓冲输入流
 * 目的: 更高效
 */
public class BufferedInputStream70 {
    public static void main(String[] args) throws IOException {
        //创建输入流
        FileInputStream fis = new FileInputStream("/Users/qujianhua/Documents/无标题.txt");
        //创建缓冲流
        BufferedInputStream bis = new BufferedInputStream(fis);

        //创建字节数组,用于存储读取的字节
        byte[] bytes = new byte[1024];
        int len;

        while ((len = bis.read(bytes)) != -1){
            System.out.print(new String(bytes,0,len));
        }
        //关闭流
        fis.close();
    }
}
